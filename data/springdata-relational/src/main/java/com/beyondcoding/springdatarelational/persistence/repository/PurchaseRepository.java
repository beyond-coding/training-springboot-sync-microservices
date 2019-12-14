package com.beyondcoding.springdatarelational.persistence.repository;

import com.beyondcoding.springdatarelational.persistence.domain.Currency;
import com.beyondcoding.springdatarelational.persistence.domain.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface PurchaseRepository extends JpaRepository<Purchase, Long> {

    List<Purchase> findByCurrency(Currency currency);

    List<Purchase> findByTimestampAfter(LocalDateTime localDateTime);
}
