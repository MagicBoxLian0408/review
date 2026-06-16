package kr.magicbox.review.adapter.in.web.dto.response;

import lombok.Builder;

@Builder
public record UserInfo(Long id, String nickname) {}
