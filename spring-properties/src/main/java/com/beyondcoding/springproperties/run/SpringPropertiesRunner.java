package com.beyondcoding.springproperties.run;

import com.beyondcoding.springproperties.configurationproperties.DancingSchoolService;
import com.beyondcoding.springproperties.configurationproperties.FacilitiesService;
import com.beyondcoding.springproperties.configurationproperties.LibraryService;
import com.beyondcoding.springproperties.value.DaysService;
import com.beyondcoding.springproperties.value.NumberService;
import com.beyondcoding.springproperties.value.WordService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringPropertiesRunner {

    @Bean
    ApplicationRunner valueProperties(WordService wordService, NumberService numberService, DaysService daysService) {
        return args -> {
            System.out.println("--- VALUE PROPERTIES ---");
            System.out.println(wordService.getWord());
            System.out.println(numberService.getNumber());
            System.out.println(daysService.getDays());
            System.out.println("--- *** ---");
        };
    }

    @Bean
    ApplicationRunner configurationPropertiesMap(LibraryService libraryService) {
        return args -> {
            System.out.println("--- CONFIGURATION PROPERTIES MAP ---");
            System.out.println(libraryService.getBooks());
            System.out.println("--- *** ---");
        };
    }

    @Bean
    ApplicationRunner configurationPropertiesSingleClass(FacilitiesService facilitiesService) {
        return args -> {
            System.out.println("--- CONFIGURATION PROPERTIES SINGLE CLASS ---");
            System.out.println(facilitiesService.getSauna());
            System.out.println("--- *** ---");
        };
    }

    @Bean
    ApplicationRunner configurationPropertiesSeveralClasses(DancingSchoolService dancingSchoolService) {
        return args -> {
            System.out.println("--- CONFIGURATION PROPERTIES SEVERAL CLASSES ---");
            dancingSchoolService.getBallerinas().forEach(System.out::println);
            System.out.println("--- *** ---");
        };
    }
}
