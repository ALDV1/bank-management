package com.bankmanagement.repositories;

import com.bankmanagement.core.enums.AccountStatus;
import com.bankmanagement.entities.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<AccountEntity, Integer> {
    //поиск аккаунтов с  полож/отриц балансом
    List<AccountEntity> findAccountEntitiesByBalance(Double balance);

    //поиск по статусу
    List<AccountEntity> findAccountEntitiesByStatus(AccountStatus status);



}
