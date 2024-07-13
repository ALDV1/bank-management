package com.bankmanagement.core.dto;

import com.bankmanagement.core.enums.CardStatus;
import com.bankmanagement.entities.AccountEntity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
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
    @NotNull
    private Integer id;

    @NotBlank(message = "Card number cannot be blank")
    @Pattern(regexp = "\\d{4}-\\d{4}-\\d{4}-\\d{4}", message = "Card number must be in the format XXXX-XXXX-XXXX-XXXX")
    private String cardNumber;

    @NotNull(message = "Expiry date cannot be null")
    private Date expiryDate;

    @NotBlank(message = "Cardholder name cannot be blank")
    @Size(max = 255, message = "Cardholder name cannot exceed 255 characters")
    private String cardholderName;

    @NotNull(message = "Card status cannot be null")
    private CardStatus status;

    @NotNull(message = "Account cannot be null")
    private AccountEntity account;

}
