package com.beyondcoding.springwebserver.pathvariable;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CalculatorEndpointTest {

    @Autowired
    TestRestTemplate restTemplate;

    String url = "/calculate";

    @ParameterizedTest
    @CsvSource({
            "0, 0, 0",
            "1, 1, 0",
            "1, 0, 1",
            "2, 1, 1",
            "0, 1, -1",
            "0, -1, 1",
            "-2, -1, -1",
    })
    void sum(int expected, int number1, int number2) {
        String endpoint = url + "/sum/" + number1 + "/" + number2;
        int result = restTemplate.getForObject(endpoint, Integer.class);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({
            "0, 0, 0",
            "1, 1, 0",
            "-1, 0, 1",
            "0, 1, 1",
            "2, 1, -1",
            "-2, -1, 1",
            "0, -1, -1",
    })
    void subtract(int expected, int number1, int number2) {
        String endpoint = url + "/subtract/" + number1 + "/" + number2;
        int result = restTemplate.getForObject(endpoint, Integer.class);
        Assertions.assertEquals(expected, result);
    }
}