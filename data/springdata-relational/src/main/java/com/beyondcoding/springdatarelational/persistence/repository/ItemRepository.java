package com.beyondcoding.springdatarelational.persistence.repository;

import com.beyondcoding.springdatarelational.persistence.domain.Item;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ItemRepository extends JpaRepository<Item, Long> {

    Optional<Item> findByName(String name);

    List<Item> findByTags(String tag);

}
