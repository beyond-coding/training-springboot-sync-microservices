package com.beyondcoding.uppercaseserver;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/uppercase")
public class UppercaseServerEndpoint {

    @PostMapping
    String post(@RequestBody String text) {
        return text.toUpperCase();
    }

}
