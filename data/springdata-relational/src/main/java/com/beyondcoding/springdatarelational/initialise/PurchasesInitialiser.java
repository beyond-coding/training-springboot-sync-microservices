package com.beyondcoding.springdatarelational.initialise;

import com.beyondcoding.springdatarelational.persistence.domain.Currency;
import com.beyondcoding.springdatarelational.persistence.domain.Item;
import com.beyondcoding.springdatarelational.persistence.domain.Purchase;
import com.beyondcoding.springdatarelational.persistence.repository.ItemRepository;
import com.beyondcoding.springdatarelational.persistence.repository.PurchaseRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Configuration
public class PurchasesInitialiser {

    @Bean
    ApplicationRunner initialisePurchases(PurchaseRepository purchaseRepository, ItemRepository itemRepository) {
        return args -> {
            if (purchaseRepository.count() > 0) {
                System.out.println("--- PURCHASES ALREADY INITIALISED");
                return;
            }
            System.out.println("--- PURCHASES INITIALISATION");
            List<Purchase> purchases = createPurchases(itemRepository);
            List<Purchase> saved = purchaseRepository.saveAll(purchases);
            saved.forEach(System.out::println);
            System.out.println("--- PURCHASES INITIALISED");
        };
    }

    private List<Purchase> createPurchases(ItemRepository itemRepository) {
        List<Item> items = itemRepository.findAll();
        Purchase purchase1 = createPurchase(Set.of(items.get(0), items.get(1)), 29.90, Currency.EUR, LocalDateTime.now());
        Purchase purchase2 = createPurchase(Set.of(items.get(2)), 14.90, Currency.USD, LocalDateTime.of(2018, 10, 01, 14, 30));
        return List.of(purchase1, purchase2);
    }

    private Purchase createPurchase(Set<Item> items, double price, Currency currency, LocalDateTime timestamp) {
        Purchase purchase = new Purchase();
        purchase.setItems(items);
        purchase.setPrice(price);
        purchase.setCurrency(currency);
        purchase.setTimestamp(timestamp);
        return purchase;
    }

}
