package com.beyondcoding.springboot.run;

import com.beyondcoding.springboot.scope.PrototypeScopeBean;
import com.beyondcoding.springboot.scope.SingletonScopeBean;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.stream.IntStream;

@Configuration
public class ScopeConfiguration {

    @Bean
    ApplicationRunner scopeSingleton(ApplicationContext applicationContext) {
        return args -> {
            System.out.println("--- SPRING SCOPE SINGLETON ---");
            IntStream.range(0, 5)
                    .mapToObj(n -> applicationContext.getBean(SingletonScopeBean.class))
                    .map(SingletonScopeBean::getMessage)
                    .forEach(System.out::println);
            System.out.println("--- *** ---");
        };
    }

    @Bean
    ApplicationRunner scopePrototype(ApplicationContext applicationContext) {
        return args -> {
            System.out.println("--- SPRING SCOPE SINGLETON ---");
            IntStream.range(0, 5)
                    .mapToObj(n -> applicationContext.getBean(PrototypeScopeBean.class))
                    .map(PrototypeScopeBean::getMessage)
                    .forEach(System.out::println);
            System.out.println("--- *** ---");
        };
    }
}
