package com.beyondcoding.springboot.creation.manual;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Configuration
public class BeanConfiguration {

    @Bean
    ReusableBean blueBean() {
        return new ReusableBean("I am a BLUE bean - Manually configured");
    }

    @Bean
    ReusableBean greenBean() {
        return new ReusableBean("I am a GREEN bean - Manually configured");
    }

    @Bean
    List<ReusableBean> numberBeans() {
        String template = "I am the bean number %d - Manually configured";
        return Stream.of(1, 2, 3, 4)
                .map(number -> String.format(template, number))
                .map(ReusableBean::new)
                .collect(Collectors.toList());
    }
}
