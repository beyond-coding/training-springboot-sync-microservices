package com.beyondcoding.springboot.creation.automatic.advanced;

import org.springframework.stereotype.Component;

@Component
public class Batman implements Superhero {

    @Override
    public String getSuperPowers() {
        return "millionaire";
    }
}
