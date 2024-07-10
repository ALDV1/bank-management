package com.bankmanagement.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "verification", schema = "verification_service")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class VerificationEntity {

    @Id
    private String email;

    private String code;
}
