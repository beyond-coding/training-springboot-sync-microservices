package com.beyondcoding.springboot.creation.automatic.basic;

import org.springframework.stereotype.Service;

@Service
public class BusinessLogicBean {

    public String getMessage() {
        return "I'm a business logic bean - Service";
    }

}
