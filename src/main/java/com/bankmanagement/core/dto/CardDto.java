package com.bankmanagement.core.dto;

import com.bankmanagement.core.enums.CardStatus;
import com.bankmanagement.entities.AccountEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CardDto {
    private Integer id;

    private String cardNumber;

    private Date expiryDate;

    private String cardholderName;

    private CardStatus status;

    private AccountEntity account;

}
