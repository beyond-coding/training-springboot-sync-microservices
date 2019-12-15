package com.beyondcoding.uppercaseclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient("uppercase-server")
public interface UppercaseFeignClient {

    @PostMapping("/uppercase")
    String toUppercase(String text);

}
