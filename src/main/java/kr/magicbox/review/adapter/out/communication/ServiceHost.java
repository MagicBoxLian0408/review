package kr.magicbox.review.adapter.out.communication;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ServiceHost {
    USER("user");

    private final String hostName;
}
