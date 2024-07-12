package com.bankmanagement.core.mappers;

import com.bankmanagement.core.dto.AccountDto;
import com.bankmanagement.entities.AccountEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AccountMapper {
    AccountEntity toEntity(AccountDto accountDto);
    AccountDto toDto(AccountEntity accountEntity);
}
