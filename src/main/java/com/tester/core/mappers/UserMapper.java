package com.tester.core.mappers;

import com.tester.core.dto.UserDTO;
import com.tester.core.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper( UserMapper.class );
    UserDTO toDTO(User user);
}
