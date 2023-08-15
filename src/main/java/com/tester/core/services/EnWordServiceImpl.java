package com.tester.core.services;

import com.tester.core.model.EnWord;
import com.tester.core.repository.EnWordRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EnWordServiceImpl implements EnWordService{
    private final EnWordRepository enWordRepository;
    @Override
    public EnWord getEnWord(Long id){
        return enWordRepository.getById(id);
    }
}
