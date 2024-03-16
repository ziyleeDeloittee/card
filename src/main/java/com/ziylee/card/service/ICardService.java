package com.ziylee.card.service;

import com.ziylee.card.domain.dto.CardDto;

public interface ICardService {
    void createCard(String mobileNumber);

    CardDto fetchCard(String mobileNumber);

    boolean updateCard(CardDto cardDto);

    boolean deleteCard(String mobileNumber);
}
