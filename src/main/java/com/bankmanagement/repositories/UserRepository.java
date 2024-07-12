package com.bankmanagement.repositories;

import com.bankmanagement.core.enums.Role;
import com.bankmanagement.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    List<UserEntity> findUserEntitiesByRoles(Role roles);
    List<UserEntity>findUserEntitiesByIsBlocked(Boolean isBlocked);
}
