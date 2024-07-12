package com.bankmanagement.core.dto;

import com.bankmanagement.entities.AccountEntity;
import com.bankmanagement.entities.RoleEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private Integer id;

    private String firstName;

    private String secondName;

    private String email;

    private String password;

    private Boolean isBlocked;

    private Set<RoleEntity> roles;

    private Set<AccountEntity> accounts;
}
