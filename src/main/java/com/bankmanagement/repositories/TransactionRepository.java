package com.bankmanagement.repositories;

import com.bankmanagement.core.enums.TransactionStatus;
import com.bankmanagement.core.enums.TransactionType;
import com.bankmanagement.entities.TransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<TransactionEntity, Integer> {
    List<TransactionEntity> findTransactionEntitiesByStatus(TransactionStatus status);
    List<TransactionEntity>findTransactionEntitiesByTransactionType(TransactionType transactionType);
}
