package com.tester.core.mappers;

import com.tester.core.dto.CardDTO;
import com.tester.core.model.Card;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface CardMapper {
    @Mapping(target = "enWordDTO", source = "enWord")
    @Mapping(target = "noWordDTO", source = "noWord")
    CardDTO toDTO(Card enWord);
}
