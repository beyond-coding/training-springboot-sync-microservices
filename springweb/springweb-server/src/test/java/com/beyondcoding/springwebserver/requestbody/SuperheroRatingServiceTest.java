package com.beyondcoding.springwebserver.requestbody;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;
import java.util.Set;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
class SuperheroRatingServiceTest {

    @Autowired
    SuperheroRatingService superheroRatingService;

    String name = "Batman";
    int rating = 5;
    SuperheroRating superheroRating = new SuperheroRating(name, rating);

    @Test
    void findAll() {
        Set<SuperheroRating> result = superheroRatingService.findAll();
        Set<SuperheroRating> expected = Set.of();
        Assertions.assertEquals(expected, result);
    }

    @Test
    void findByNameFindsNothing() {
        Optional<SuperheroRating> result = superheroRatingService.findByName(name);
        Assertions.assertTrue(result.isEmpty());
    }

    @Test
    void findByNameFindsOne() {
        superheroRatingService.addIfNew(superheroRating);
        Optional<SuperheroRating> result = superheroRatingService.findByName(name);
        Assertions.assertTrue(result.isPresent());
        superheroRatingService.removeAll();
    }

    @Test
    void addIfNewAdds() {
        Assertions.assertTrue(superheroRatingService.findAll().isEmpty());
        SuperheroRating result = superheroRatingService.addIfNew(superheroRating);
        Assertions.assertEquals(name, result.getName());
        Assertions.assertEquals(rating, result.getRating());
        superheroRatingService.removeAll();
    }

    @Test
    void addIfNewDoesNotAdd() {
        SuperheroRating rating1 = superheroRatingService.addIfNew(superheroRating);
        Assertions.assertEquals(name, rating1.getName());
        Assertions.assertEquals(rating, rating1.getRating());
        int otherRating = 2;
        SuperheroRating rating2 = new SuperheroRating(name, otherRating);
        SuperheroRating other = superheroRatingService.addIfNew(rating2);
        Assertions.assertEquals(rating1.getName(), other.getName());
        Assertions.assertNotEquals(rating1.getRating(), otherRating);
        superheroRatingService.removeAll();
    }

    @Test
    void replace() {
        SuperheroRating rating1 = superheroRatingService.addIfNew(superheroRating);
        int otherRating = 2;
        SuperheroRating other = new SuperheroRating(name, otherRating);
        SuperheroRating rating2 = superheroRatingService.replace(other);
        Assertions.assertEquals(rating1.getName(), rating2.getName());
        Assertions.assertEquals(rating2.getRating(), otherRating);
        superheroRatingService.removeAll();
    }

    @Test
    void removeAll() {
        superheroRatingService.addIfNew(superheroRating);
        Assertions.assertFalse(superheroRatingService.findAll().isEmpty());
        superheroRatingService.removeAll();
        Assertions.assertTrue(superheroRatingService.findAll().isEmpty());
    }

    @Test
    void removeByName() {
        superheroRatingService.addIfNew(superheroRating);
        Assertions.assertFalse(superheroRatingService.findAll().isEmpty());
        superheroRatingService.removeByName(name);
        Assertions.assertTrue(superheroRatingService.findAll().isEmpty());
    }
}