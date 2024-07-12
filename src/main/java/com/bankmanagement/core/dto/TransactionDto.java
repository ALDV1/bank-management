package com.bankmanagement.core.dto;

import com.bankmanagement.core.enums.TransactionStatus;
import com.bankmanagement.core.enums.TransactionType;
import com.bankmanagement.entities.AccountEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TransactionDto {
    private Integer id;

    private Double amount;

    private TransactionType transactionType;

    private TransactionStatus status;

    private AccountEntity account;
}
