package com.beyondcoding.uppercaseclient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class UppercaseClientEndpoint {

    private final UppercaseFeignClient uppercaseFeignClient;

    public UppercaseClientEndpoint(UppercaseFeignClient uppercaseFeignClient) {
        this.uppercaseFeignClient = uppercaseFeignClient;
    }

    @GetMapping("/{text}")
    String get(@PathVariable String text) {
        return uppercaseFeignClient.toUppercase(text);
    }

}
