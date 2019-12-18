package com.beyondcoding.springdatarelational.run;

import com.beyondcoding.springdatarelational.persistence.domain.Currency;
import com.beyondcoding.springdatarelational.persistence.repository.ItemRepository;
import com.beyondcoding.springdatarelational.persistence.repository.PurchaseRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;

@Configuration
public class DatabaseDisplay {

    @Bean
    ApplicationRunner displayDatabase(PurchaseRepository purchaseRepository, ItemRepository itemRepository) {
        return args -> {
            System.out.println("--- DISPLAY ALL ITEMS ---");
            itemRepository.findAll().forEach(System.out::println);

            System.out.println("--- DISPLAY ALL PURCHASES ---");
            purchaseRepository.findAll().forEach(System.out::println);

            System.out.println("--- DISPLAY CELLPHONE ITEM ---");
            System.out.println(itemRepository.findByName("Cellphone"));

            System.out.println("--- DISPLAY ALL ITEMS WITH ELECTRONIC TAG ---");
            itemRepository.findByTags("electronic").forEach(System.out::println);

            System.out.println("--- DISPLAY ALL PURCHASES WITH EUR CURRENCY ---");
            purchaseRepository.findByCurrency(Currency.EUR).forEach(System.out::println);

            System.out.println("--- DISPLAY ALL PURCHASES AFTER 2019 ---");
            LocalDateTime startOf2019 = LocalDateTime.of(2019, 01, 01, 0, 0);
            purchaseRepository.findByTimestampAfter(startOf2019).forEach(System.out::println);

            System.out.println("--- *** ---");
        };
    }

}
