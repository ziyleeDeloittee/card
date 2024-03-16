package com.ziylee.card.mapper;

import com.ziylee.card.domain.dto.CardDto;
import com.ziylee.card.domain.entity.Card;

public class CardMapper {

    public static CardDto mapToCardDto(Card cards) {
        return CardDto.builder()
                .cardNumber(cards.getCardNumber())
                .cardType(cards.getCardType())
                .mobileNumber(cards.getMobileNumber())
                .totalLimit(cards.getTotalLimit())
                .availableAmount(cards.getAvailableAmount())
                .amountUsed(cards.getAmountUsed())
                .build();
    }

    public static Card mapToCard(CardDto cardsDto, Card cards) {
        cards.setCardNumber(cardsDto.cardNumber());
        cards.setCardType(cardsDto.cardType());
        cards.setMobileNumber(cardsDto.mobileNumber());
        cards.setTotalLimit(cardsDto.totalLimit());
        cards.setAvailableAmount(cardsDto.availableAmount());
        cards.setAmountUsed(cardsDto.amountUsed());
        return cards;
    }

}