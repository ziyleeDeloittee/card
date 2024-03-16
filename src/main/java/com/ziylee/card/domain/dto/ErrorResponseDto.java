package com.ziylee.card.domain.dto;

import lombok.Builder;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Builder
public record ErrorResponseDto(
        String apiPath,
        HttpStatus errorCode,
        String errorMessage,
        LocalDateTime errorTime
) {}
