package com.beyondcoding.springproperties.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DaysService {

    @Value("${days-of-the-week}")
    private List<String> days;

    public List<String> getDays() {
        return days;
    }
}
