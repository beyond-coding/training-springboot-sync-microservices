package com.beyondcoding.springwebclient;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.validation.Valid;
import java.util.Set;

@RestController
@RequestMapping("/ratings")
public class SuperheroRatingsEndpoint {

    private final RestTemplate restTemplate;
    private final String baseUrl = "http://localhost:8080/superheroratings";

    public SuperheroRatingsEndpoint(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping
    Set<SuperheroRating> getAll() {
        SuperheroRating[] ratings = restTemplate.getForObject(baseUrl, SuperheroRating[].class);
        return Set.of(ratings);
    }

    @GetMapping("/{name}")
    SuperheroRating getOne(@PathVariable String name) {
        return restTemplate.getForObject(baseUrl + "/" + name, SuperheroRating.class);
    }

    @PostMapping
    SuperheroRating post(@Valid @RequestBody SuperheroRating rating) {
        return restTemplate.postForObject(baseUrl, rating, SuperheroRating.class);
    }

    @PutMapping
    SuperheroRating put(@Valid @RequestBody SuperheroRating rating) {
        restTemplate.put(baseUrl, rating);
        return rating;
    }

    @DeleteMapping
    void deleteAll() {
        restTemplate.delete(baseUrl);
    }

    @DeleteMapping("/{name}")
    void deleteOne(@PathVariable String name) {
        restTemplate.delete(baseUrl + "/" + name);
    }
}
