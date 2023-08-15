package com.tester.core.mappers;

import com.tester.core.dto.EnWordDTO;
import com.tester.core.model.EnWord;
import org.mapstruct.Mapper;

@Mapper
public interface EnWordMapper {
    EnWordDTO toDTO(EnWord enWord);
}
