package kr.magicbox.review.application.port.in;

import kr.magicbox.review.application.dto.query.GetReviewsByUserIdQuery;
import kr.magicbox.review.application.dto.result.ReviewResult;

import java.util.List;

public interface GetReviewsByUserIdUseCase {
    List<ReviewResult> getReviewsByUserId(GetReviewsByUserIdQuery query);
}
