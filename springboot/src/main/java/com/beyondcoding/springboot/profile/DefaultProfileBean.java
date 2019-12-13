package com.beyondcoding.springboot.profile;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class DefaultProfileBean {

    @PostConstruct
    public void setup() {
        System.out.println("--- SPRING PROFILE ---");
        System.out.println("DEFAULT profile is active");
        System.out.println("--- *** ---");
    }
}
