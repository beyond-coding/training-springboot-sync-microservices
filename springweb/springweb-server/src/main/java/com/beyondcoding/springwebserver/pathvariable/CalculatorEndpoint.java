package com.beyondcoding.springwebserver.pathvariable;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculate")
public class CalculatorEndpoint {

    @GetMapping("/sum/{number1}/{number2}")
    int sum(@PathVariable int number1, @PathVariable int number2) {
        return number1 + number2;
    }

    @GetMapping("/subtract/{number1}/{number2}")
    int subtract(@PathVariable int number1, @PathVariable int number2) {
        return number1 - number2;
    }

}
