package com.beyondcoding.springboot.run;

import com.beyondcoding.springboot.injection.AdvancedAutomaticInjection;
import com.beyondcoding.springboot.injection.BasicAutomaticInjection;
import com.beyondcoding.springboot.injection.ManualInjection1;
import com.beyondcoding.springboot.injection.ManualInjection2;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InjectionConfiguration {

    @Bean
    ApplicationRunner injectionBasicAutomatic(BasicAutomaticInjection basicAutomaticInjection) {
        return args -> {
            System.out.println("--- INJECTION AUTOMATIC MANUAL ---");
            System.out.println(basicAutomaticInjection.getMessage());
            System.out.println("--- *** ---");
        };
    }

    @Bean
    ApplicationRunner injectionManual(ManualInjection1 manualInjection1, ManualInjection2 manualInjection2) {
        return args -> {
            System.out.println("--- INJECTION MANUAL ---");
            System.out.println(manualInjection1.getMessage());
            System.out.println(manualInjection2.getMessage());
            System.out.println("--- *** ---");
        };
    }

    @Bean
    ApplicationRunner injectionAdvancedAutomatic(AdvancedAutomaticInjection advancedAutomaticInjection) {
        return args -> {
            System.out.println("--- INJECTION AUTOMATIC ADVANCED ---");
            System.out.println(advancedAutomaticInjection.getMessage());
            System.out.println("--- *** ---");
        };
    }

}
