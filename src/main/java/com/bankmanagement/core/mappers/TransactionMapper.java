package com.bankmanagement.core.mappers;

import com.bankmanagement.core.dto.TransactionDto;
import com.bankmanagement.entities.TransactionEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TransactionMapper {
    TransactionEntity toEntity(TransactionDto transactionDto);
    TransactionDto toDto(TransactionEntity transactionEntity);
}
