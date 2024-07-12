package com.bankmanagement.core.dto;

import com.bankmanagement.core.enums.AccountStatus;
import com.bankmanagement.entities.CardEntity;
import com.bankmanagement.entities.TransactionEntity;
import com.bankmanagement.entities.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AccountDto {
    private Integer id;

    private Double balance;

    private AccountStatus status;

    private UserEntity user;

    private Set<CardEntity> cards;

    private Set<TransactionEntity> transactions;
}
