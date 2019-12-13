package com.beyondcoding.springboot.creation.automatic.advanced;

import org.springframework.stereotype.Component;

@Component
public class Superman implements Superhero {

    @Override
    public String getSuperPowers() {
        return "fly, laser eyes, super strength";
    }
}
