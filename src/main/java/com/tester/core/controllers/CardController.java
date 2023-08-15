package com.tester.core.controllers;

import com.tester.core.dto.CardDTO;
import com.tester.core.mappers.CardMapper;
import com.tester.core.model.Card;
import com.tester.core.services.CardService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.parameters.P;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CardController {
    private final CardService cardService;
    private final CardMapper cardMapper;
    @GetMapping("/cards/{id}")
    public CardDTO getCardById(@PathVariable Long id){
        Card card = cardService.getCard(id);
        return cardMapper.toDTO(card);
    }
}
