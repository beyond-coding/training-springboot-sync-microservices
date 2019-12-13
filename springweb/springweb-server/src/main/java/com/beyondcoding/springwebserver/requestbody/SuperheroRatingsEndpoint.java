package com.beyondcoding.springwebserver.requestbody;

import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/superheroratings")
public class SuperheroRatingsEndpoint {

    private final Set<SuperheroRating> ratings = new HashSet<>();

    @GetMapping
    Set<SuperheroRating> getAll() {
        return ratings;
    }

    @GetMapping("/{name}")
    SuperheroRating getOne(@PathVariable String name) {
        return ratings.stream()
                .filter(rating -> rating.getName().equals(name))
                .findFirst().orElse(null);
    }

    @PostMapping
    SuperheroRating post(@Valid @RequestBody SuperheroRating rating) {
        if (ratings.contains(rating)) {
            return getOne(rating.getName());
        }
        ratings.add(rating);
        return rating;
    }

    @PutMapping
    SuperheroRating put(@Valid @RequestBody SuperheroRating rating) {
        ratings.removeIf(existing -> existing.getName().equals(rating.getName()));
        ratings.add(rating);
        return rating;
    }

    @DeleteMapping
    void deleteAll() {
        ratings.clear();
    }

    @DeleteMapping("/{name}")
    void deleteOne(@PathVariable String name) {
        ratings.removeIf(rating -> rating.getName().equals(name));
    }
}
