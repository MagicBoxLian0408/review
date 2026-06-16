package kr.magicbox.review.adapter.out.communication.grpc;

import io.grpc.ManagedChannel;
import kr.magicbox.review.adapter.out.communication.ServiceHost;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.grpc.client.GrpcChannelFactory;

@Configuration
public class GrpcConfiguration {

    @Bean
    public ManagedChannel userManagedChannel(GrpcChannelFactory grpcChannelFactory) {
        return grpcChannelFactory.createChannel(ServiceHost.USER.getHostName());
    }
}
