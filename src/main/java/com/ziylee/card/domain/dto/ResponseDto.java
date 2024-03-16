package com.ziylee.card.domain.dto;

import lombok.Builder;

@Builder
public record ResponseDto(
        String statusCode,
        String statusMsg
) {}
