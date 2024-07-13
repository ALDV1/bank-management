package com.bankmanagement.services.impl;

import com.bankmanagement.core.dto.TransactionDto;

import java.security.Principal;
import java.util.List;
import java.util.Optional;

public interface TransactionServiceIFE {
    TransactionDto createTransaction(TransactionDto transactionDto);
    Optional<TransactionDto> getTransactionById(Integer id);
    List<TransactionDto> getAllTransaction();
    TransactionDto updateTransaction(Integer id, TransactionDto transactionDto);
    void deleteTransaction(Principal principal);
    void deleteTransactionADMIN(Integer id);

}
