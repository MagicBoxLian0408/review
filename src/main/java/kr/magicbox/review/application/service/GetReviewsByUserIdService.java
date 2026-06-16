package kr.magicbox.review.application.service;

import kr.magicbox.review.application.dto.query.GetReviewsByUserIdQuery;
import kr.magicbox.review.application.dto.result.ReviewResult;
import kr.magicbox.review.application.port.in.GetReviewsByUserIdUseCase;
import kr.magicbox.review.application.port.out.ReviewRepositoryPort;
import kr.magicbox.review.application.port.out.communication.UserNicknameQueryPort;
import kr.magicbox.review.domain.vo.UserId;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class GetReviewsByUserIdService implements GetReviewsByUserIdUseCase {

    private final ReviewRepositoryPort reviewRepositoryPort;
    private final UserNicknameQueryPort userNicknameQueryPort;

    @Override
    public List<ReviewResult> getReviewsByUserId(GetReviewsByUserIdQuery query) {
        return reviewRepositoryPort.findAllByUserId(query.userId()).stream()
                .map(review -> ReviewResult.from(
                        review,
                        userNicknameQueryPort.getUserNickname(UserId.of(review.getUserId().value()))
                ))
                .toList();
    }
}
