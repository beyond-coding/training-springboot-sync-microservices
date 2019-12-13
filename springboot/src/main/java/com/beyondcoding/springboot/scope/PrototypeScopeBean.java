package com.beyondcoding.springboot.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Scope("prototype")
public class PrototypeScopeBean {

    private static int counter = 0;

    @PostConstruct
    public void setup() {
        counter++;
    }

    public String getMessage() {
        return "I'm a PROTOTYPE bean and my number is: " + counter;
    }

}
