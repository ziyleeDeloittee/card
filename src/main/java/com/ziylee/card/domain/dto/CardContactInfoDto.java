package com.ziylee.card.domain.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@ConfigurationProperties(prefix = "card")
public class CardContactInfoDto {

    private String message;
    private Map<String, String>contactDetails;
    private List<String>onCallSupport;

}
