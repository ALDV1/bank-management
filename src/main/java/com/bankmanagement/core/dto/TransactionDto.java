package com.bankmanagement.core.dto;

import com.bankmanagement.core.enums.TransactionStatus;
import com.bankmanagement.core.enums.TransactionType;
import com.bankmanagement.entities.AccountEntity;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TransactionDto {
    @NotNull
    private Integer id;

    @NotNull(message = "Amount cannot be null")
    @DecimalMin(value = "0.0", inclusive = false, message = "Amount must be greater than 0")
    private Double amount;

    @NotNull(message = "Transaction type cannot be null")
    private TransactionType transactionType;

    @NotNull(message = "Transaction status cannot be null")
    private TransactionStatus status;

    @NotNull(message = "Account cannot be null")
    private AccountEntity account;
}
