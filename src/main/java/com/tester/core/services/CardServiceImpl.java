package com.tester.core.services;

import com.tester.core.model.Card;
import com.tester.core.repository.CardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CardServiceImpl implements CardService{
    private final CardRepository cardRepository;
    @Override
    public Card getCard(Long id){
        return cardRepository.getById(id);
    }
}
