package com.bankmanagement.core.mappers;

import com.bankmanagement.core.dto.CardDto;
import com.bankmanagement.entities.CardEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CardMapper {
    CardEntity toEntity(CardDto CardDto);
    CardDto toDto(CardEntity CardEntity);
}
