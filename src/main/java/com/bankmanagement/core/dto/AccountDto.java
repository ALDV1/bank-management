package com.bankmanagement.core.dto;

import com.bankmanagement.core.enums.AccountStatus;
import com.bankmanagement.entities.CardEntity;
import com.bankmanagement.entities.TransactionEntity;
import com.bankmanagement.entities.UserEntity;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
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
    @NotNull
    private Integer id;

    @NotNull(message = "Balance is required")
    @PositiveOrZero(message = "Balance must be zero or positive")
    private Double balance;

    @NotNull(message = "Account status is required")
    private AccountStatus status;

    @NotNull(message = "User is required")
    private UserEntity user;

    private Set<CardEntity> cards;

    private Set<TransactionEntity> transactions;
}
