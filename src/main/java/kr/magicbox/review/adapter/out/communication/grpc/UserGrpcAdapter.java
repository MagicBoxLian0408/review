package kr.magicbox.review.adapter.out.communication.grpc;

import io.grpc.ManagedChannel;
import kr.magicbox.review.adapter.out.communication.grpc.exception.UserServiceUnavailableException;
import kr.magicbox.review.application.port.out.communication.UserNicknameQueryPort;
import kr.magicbox.review.domain.vo.UserId;
import kr.magicbox.user.grpc.user.GetUserNicknameRequest;
import kr.magicbox.user.grpc.user.GetUserNicknameResponse;
import kr.magicbox.user.grpc.user.UserServiceGrpc;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
@RequiredArgsConstructor
@Slf4j
public class UserGrpcAdapter implements UserNicknameQueryPort {

    private final ManagedChannel userManagedChannel;

    @Override
    public String getUserNickname(UserId userId) {
        GetUserNicknameRequest request = GetUserNicknameRequest.newBuilder()
                .setUserId(userId.value())
                .build();

        UserServiceGrpc.UserServiceBlockingStub stub = UserServiceGrpc.newBlockingStub(userManagedChannel);
        try {
            GetUserNicknameResponse response = stub.withDeadlineAfter(2, TimeUnit.SECONDS)
                    .getUserNickname(request);
            return response.getNickname();
        } catch (Throwable throwable) {
            log.warn("user 서비스 연결 실패: userId={}", userId.value(), throwable);
            throw new UserServiceUnavailableException(throwable);
        }
    }
}
