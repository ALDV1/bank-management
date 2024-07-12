package com.bankmanagement.services.impl;

import com.bankmanagement.core.dto.AccountDto;

import javax.crypto.spec.OAEPParameterSpec;
import java.security.Principal;
import java.util.List;
import java.util.Optional;

public interface AccountServiceIFE {
    AccountDto createAccount(AccountDto accountDto);
    Optional<AccountDto>getAccountById(Integer id);
    List<AccountDto> getAllAccount();
    AccountDto updateAccount(Integer id, AccountDto accountDto);
    void deleteAccount(Principal principal);
    void deleteAccountADMIN(Integer id);
}
