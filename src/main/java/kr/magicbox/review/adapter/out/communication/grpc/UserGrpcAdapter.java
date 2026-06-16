package kr.magicbox.review.adapter.out.communication.grpc;

import io.grpc.ManagedChannel;
import io.grpc.StatusRuntimeException;
import kr.magicbox.review.application.port.out.communication.UserNicknameQueryPort;
import kr.magicbox.review.domain.vo.UserId;
import kr.magicbox.user.grpc.user.GetUserNicknameRequest;
import kr.magicbox.user.grpc.user.UserServiceGrpc;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Slf4j
@Component
public class UserGrpcAdapter implements UserNicknameQueryPort {

    private final ManagedChannel userManagedChannel;

    public UserGrpcAdapter(@Qualifier("userManagedChannel") ManagedChannel userManagedChannel) {
        this.userManagedChannel = userManagedChannel;
    }

    @Override
    public String getUserNickname(UserId userId) {
        GetUserNicknameRequest request = GetUserNicknameRequest.newBuilder()
                .setUserId(userId.value())
                .build();

        UserServiceGrpc.UserServiceBlockingStub stub = UserServiceGrpc.newBlockingStub(userManagedChannel)
                .withDeadlineAfter(2, TimeUnit.SECONDS);

        try {
            return stub.getUserNickname(request).getNickname();
        } catch (StatusRuntimeException e) {
            log.warn("유저 서비스 닉네임 조회 실패 userId={}: {}", userId.value(), e.getStatus());
            return null;
        }
    }
}
