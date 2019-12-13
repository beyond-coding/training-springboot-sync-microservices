package com.beyondcoding.springboot.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Profile("awesome")
@Component
public class AwesomeProfileBean {

    @PostConstruct
    public void setup() {
        System.out.println("--- SPRING PROFILE ---");
        System.out.println("AWESOME profile is active");
        System.out.println("--- *** ---");
    }
}
