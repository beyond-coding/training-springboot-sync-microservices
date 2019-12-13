package com.beyondcoding.springboot.run;

import com.beyondcoding.springboot.creation.automatic.advanced.Superhero;
import com.beyondcoding.springboot.creation.automatic.basic.BusinessLogicBean;
import com.beyondcoding.springboot.creation.automatic.basic.DataManagementBean;
import com.beyondcoding.springboot.creation.automatic.basic.GeneralBean;
import com.beyondcoding.springboot.creation.automatic.basic.ViewBean;
import com.beyondcoding.springboot.creation.manual.ReusableBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class BeanCreationConfiguration {

    @Bean
    ApplicationRunner basicAutomaticBeans(GeneralBean generalBean, DataManagementBean dataManagementBean, BusinessLogicBean businessLogicBean, ViewBean viewBean) {
        return args -> {
            System.out.println("--- BEAN CREATION AUTOMATIC BASIC ---");
            System.out.println(generalBean.getMessage());
            System.out.println(dataManagementBean.getMessage());
            System.out.println(businessLogicBean.getMessage());
            System.out.println(viewBean.getMessage());
            System.out.println("--- *** ---");
        };
    }

    @Bean
    ApplicationRunner manualBeans(ReusableBean blueBean, ReusableBean greenBean, @Qualifier("numberBeans") List<ReusableBean> numberBeans) {
        return args -> {
            System.out.println("--- BEAN CREATION MANUAL ---");
            System.out.println(blueBean.getMessage());
            System.out.println(greenBean.getMessage());
            numberBeans.forEach(bean -> System.out.println(bean.getMessage()));
            System.out.println("--- *** ---");
        };
    }

    @Bean
    ApplicationRunner advancedAutomaticBeans(List<Superhero> superheroes) {
        return args -> {
            System.out.println("--- BEAN CREATION AUTOMATIC ADVANCED ---");
            superheroes.stream()
                    .map(superhero -> superhero.getClass().getSimpleName() + " superpowers are " + superhero.getSuperPowers())
                    .forEach(System.out::println);
            System.out.println("--- *** ---");
        };
    }

}
