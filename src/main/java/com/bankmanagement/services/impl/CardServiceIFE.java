package com.bankmanagement.services.impl;

import com.bankmanagement.core.dto.CardDto;

import java.security.Principal;
import java.util.List;
import java.util.Optional;

public interface CardServiceIFE {
    CardDto createCard(CardDto cardDto);
    Optional<CardDto> getCardById(Integer id);
    List<CardDto> getAllCard();
    CardDto updateCard(Integer id, CardDto cardDto);
    void deleteCard(Principal principal);
    void deleteCardADMIN(Integer id);
}
