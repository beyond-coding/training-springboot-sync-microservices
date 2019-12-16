package com.beyondcoding.springwebserver.requestbody;

import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Map;
import java.util.Set;

@RestController
@RequestMapping("/superheroratings")
public class SuperheroRatingsEndpoint {

    private final SuperheroRatingService superheroRatingService;

    public SuperheroRatingsEndpoint(SuperheroRatingService superheroRatingService) {
        this.superheroRatingService = superheroRatingService;
    }

    @GetMapping
    Set<SuperheroRating> getAll() {
        return superheroRatingService.findAll();
    }

    @GetMapping("/{name}")
    SuperheroRating getOne(@PathVariable String name) {
        return superheroRatingService.findByName(name).orElse(null);
    }

    @PostMapping
    SuperheroRating post(@Valid @RequestBody SuperheroRating rating, Map<String, String> parameters) {
        return superheroRatingService.addIfNew(rating);
    }

    @PutMapping
    SuperheroRating put(@Valid @RequestBody SuperheroRating rating) {
        return superheroRatingService.replace(rating);
    }

    @DeleteMapping
    void deleteAll() {
        superheroRatingService.removeAll();
    }

    @DeleteMapping("/{name}")
    void deleteOne(@PathVariable String name) {
        superheroRatingService.removeByName(name);
    }
}
