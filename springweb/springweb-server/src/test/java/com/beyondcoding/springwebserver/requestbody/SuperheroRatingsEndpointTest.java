package com.beyondcoding.springwebserver.requestbody;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class SuperheroRatingsEndpointTest {

    @Autowired
    TestRestTemplate restTemplate;

    @MockBean
    SuperheroRatingService superheroRatingService;

    String url = "/superheroratings";

    SuperheroRating superheroRating = new SuperheroRating("Batman", 5);

    @Test
    void getAll() {
        restTemplate.getForObject(url, SuperheroRating[].class);
        Mockito.verify(superheroRatingService).findAll();
    }

    @Test
    void getOne() {
        String name = "Batman";
        restTemplate.getForObject(url + "/" + name, SuperheroRating.class);
        Mockito.verify(superheroRatingService).findByName(name);
    }

    @Test
    void post() {
        restTemplate.postForObject(url, superheroRating, SuperheroRating.class);
        Mockito.verify(superheroRatingService).addIfNew(superheroRating);
    }

    @Test
    void put() {
        restTemplate.put(url, superheroRating);
        Mockito.verify(superheroRatingService).replace(superheroRating);
    }

    @Test
    void deleteAll() {
        restTemplate.delete(url);
        Mockito.verify(superheroRatingService).removeAll();
    }

    @Test
    void deleteOne() {
        String name = "Batman";
        restTemplate.delete(url + "/" + name);
        Mockito.verify(superheroRatingService).removeByName(name);
    }
}