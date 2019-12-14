package com.beyondcoding.springdatarelational.api;

import com.beyondcoding.springdatarelational.persistence.domain.Item;
import com.beyondcoding.springdatarelational.persistence.repository.ItemRepository;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemsEndpoint {

    private final ItemRepository itemRepository;

    public ItemsEndpoint(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @GetMapping
    List<Item> get() {
        return itemRepository.findAll();
    }

    @PostMapping
    Item post(@Valid @RequestBody Item item) {
        return itemRepository.save(item);
    }
}
