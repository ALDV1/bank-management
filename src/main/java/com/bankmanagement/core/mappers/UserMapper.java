package com.bankmanagement.core.mappers;

import com.bankmanagement.core.dto.UserDto;
import com.bankmanagement.entities.UserEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserEntity toEntity(UserDto userDto);
    UserDto toDto(UserEntity userEntity);
}
