package com.beyondcoding.springdatarelational.initialise;

import com.beyondcoding.springdatarelational.persistence.domain.Item;
import com.beyondcoding.springdatarelational.persistence.repository.ItemRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Set;

@Configuration
public class ItemsInitialiser {

    @Bean
    ApplicationRunner initialiseItems(ItemRepository itemRepository) {
        return args -> {
            if (itemRepository.count() > 1) {
                System.out.println("--- ITEMS ALREADY INITIALISED");
                return;
            }
            System.out.println("--- ITEMS INITIALISATION");
            List<Item> items = createItems();
            List<Item> saved = itemRepository.saveAll(items);
            saved.forEach(System.out::println);
            System.out.println("--- ITEMS INITIALISED");
        };
    }

    private List<Item> createItems() {
        Item item1 = createItem("cellphone", Set.of("electronic", "communication"));
        Item item2 = createItem("laptop", Set.of("electronic", "work"));
        Item item3 = createItem("desk", Set.of("work", "home"));
        return List.of(item1, item2, item3);
    }

    private Item createItem(String name, Set<String> tags) {
        Item item1 = new Item();
        item1.setName(name);
        item1.setTags(tags);
        return item1;
    }

}
