package com.beyondcoding.springboot.creation.automatic.basic;

import org.springframework.stereotype.Component;

@Component
public class GeneralBean {

    public String getMessage(){
        return "I'm a general bean - Component";
    }

}
