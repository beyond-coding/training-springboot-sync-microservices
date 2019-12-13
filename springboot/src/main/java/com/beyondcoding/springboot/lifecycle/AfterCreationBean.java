package com.beyondcoding.springboot.lifecycle;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class AfterCreationBean {

    @PostConstruct
    public void setup(){
        System.out.println("--- BEAN LIFECYCLE ---");
        System.out.println("Triggered right after CREATION");
        System.out.println("--- *** ---");
    }

}
