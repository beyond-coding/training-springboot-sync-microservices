package com.beyondcoding.springproperties.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class WordService {

    @Value("${word}")
    private String word;

    public String getWord() {
        return word;
    }
}
