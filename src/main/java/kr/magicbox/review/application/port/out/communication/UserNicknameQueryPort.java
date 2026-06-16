package kr.magicbox.review.application.port.out.communication;

import kr.magicbox.review.domain.vo.UserId;

public interface UserNicknameQueryPort {
    String getUserNickname(UserId userId);
}
