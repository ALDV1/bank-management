package com.bankmanagement.core.dto;

import com.bankmanagement.entities.AccountEntity;
import com.bankmanagement.entities.RoleEntity;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
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
    @NotNull
    private Integer id;

    @NotBlank(message = "First name cannot be blank")
    @Size(min = 2, max = 50, message = "First name must be between 2 and 50 characters")
    private String firstName;

    @NotBlank(message = "Second name cannot be blank")
    @Size(min = 2, max = 50, message = "Second name must be between 2 and 50 characters")
    private String secondName;

    @NotBlank(message = "Email cannot be blank")
    @Email(message = "Email should be valid")
    private String email;

    @NotNull(message = "isBlocked cannot be null")
    private Boolean isBlocked;

    @NotNull(message = "Roles cannot be null")
    private Set<RoleEntity> roles;

    @NotNull(message = "Accounts cannot be null")
    private Set<AccountEntity> accounts;
}
