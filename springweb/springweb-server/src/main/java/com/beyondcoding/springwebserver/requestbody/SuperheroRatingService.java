package com.beyondcoding.springwebserver.requestbody;

import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class SuperheroRatingService {

    private final Set<SuperheroRating> ratings = new HashSet<>();

    public Set<SuperheroRating> findAll() {
        return ratings;
    }

    public Optional<SuperheroRating> findByName(String name) {
        return ratings.stream()
                .filter(rating -> rating.getName().equals(name))
                .findFirst();
    }

    public SuperheroRating addIfNew(SuperheroRating rating) {
        Optional<SuperheroRating> existing = findByName(rating.getName());
        if (existing.isPresent()) {
            return existing.get();
        }
        ratings.add(rating);
        return rating;
    }

    public SuperheroRating replace(SuperheroRating rating) {
        removeByName(rating.getName());
        ratings.add(rating);
        return rating;
    }

    public void removeAll() {
        ratings.clear();
    }

    public void removeByName(String name) {
        ratings.removeIf(existing -> existing.getName().equals(name));
    }
}
