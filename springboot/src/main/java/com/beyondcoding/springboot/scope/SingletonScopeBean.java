package com.beyondcoding.springboot.scope;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
//@Scope("singleton")
// If no explicit annotation is provided, the default scope is singleton
public class SingletonScopeBean {

    private static int counter = 0;

    @PostConstruct
    public void setup() {
        counter++;
    }

    public String getMessage() {
        return "I'm a SINGLETON bean and my number is: " + counter;
    }

}
