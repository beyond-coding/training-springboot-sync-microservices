package com.beyondcoding.springwebserver.basic;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class BasicEndpoint {

    @GetMapping
    String get() {
        return "This is a very basic message!";
    }

}
