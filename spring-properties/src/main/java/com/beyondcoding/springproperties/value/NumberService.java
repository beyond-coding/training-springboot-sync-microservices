package com.beyondcoding.springproperties.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class NumberService {

    @Value("${number}")
    private int number;

    public int getNumber() {
        return number;
    }
}
