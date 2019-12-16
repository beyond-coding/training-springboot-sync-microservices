package com.beyondcoding.springboot.lifecycle;

import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

@Component
public class BeforeDestructionBean {

    // This lifecycle stage is very unstable, since depends on external factors like the JVM
    @PreDestroy
    public void destroy() {
        System.out.println("--- BEAN LIFECYCLE ---");
        System.out.println("Triggered right before DESTRUCTION");
        System.out.println("--- *** ---");
    }

}
