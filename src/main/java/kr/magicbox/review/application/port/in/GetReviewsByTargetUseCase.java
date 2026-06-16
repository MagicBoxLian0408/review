package kr.magicbox.review.application.port.in;

import kr.magicbox.review.application.dto.query.GetReviewsByTargetQuery;
import kr.magicbox.review.application.dto.result.ReviewResult;

import java.util.List;

public interface GetReviewsByTargetUseCase {
    List<ReviewResult> getReviewsByTarget(GetReviewsByTargetQuery query);
}
