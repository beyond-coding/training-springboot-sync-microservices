package com.beyondcoding.springwebclient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/calculator")
public class CalculatorEndpoint {

    private final RestTemplate restTemplate;

    public CalculatorEndpoint(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/sum/{number1}/{number2}")
    int sum(@PathVariable int number1, @PathVariable int number2) {
        String url = "http://localhost:8080/calculate/sum/" + number1 + "/" + number2;
        return restTemplate.getForObject(url, Integer.class);
    }

    @GetMapping("/subtract/{number1}/{number2}")
    int subtract(@PathVariable int number1, @PathVariable int number2) {
        String url = "http://localhost:8080/calculate/subtract/" + number1 + "/" + number2;
        return restTemplate.getForObject(url, Integer.class);
    }
}
