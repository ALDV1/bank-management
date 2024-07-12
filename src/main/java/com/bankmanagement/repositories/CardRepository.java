package com.bankmanagement.repositories;

import com.bankmanagement.core.enums.CardStatus;
import com.bankmanagement.entities.CardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CardRepository extends JpaRepository<CardEntity, Integer> {
    List<CardEntity> findCardEntitiesByStatus(CardStatus status);
}
