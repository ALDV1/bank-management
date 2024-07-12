package com.bankmanagement.entities;

import com.bankmanagement.core.enums.TransactionStatus;
import com.bankmanagement.core.enums.TransactionType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@Entity
@Table(name = "transaction", schema = "transaction_service")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TransactionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "transaction_seq_generator")
    @SequenceGenerator(name = "transaction_seq_generator", sequenceName = "transaction_id_seq", allocationSize = 1)
    private Integer id;
    //TODO: ИСПРАВЬ
    private Double amount;

    @Enumerated(EnumType.STRING)
    @Column(name = "transaction_type", nullable = false, columnDefinition = "varchar(50) default 'DEPOSIT'")
    private TransactionType transactionType;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false, columnDefinition = "varchar(50) default 'PENDING'")
    private TransactionStatus status;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at", updatable = false)
    private Timestamp createdAt;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private AccountEntity account;
}
