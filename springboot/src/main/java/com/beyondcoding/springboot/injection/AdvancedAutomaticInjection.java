package com.beyondcoding.springboot.injection;

import com.beyondcoding.springboot.creation.automatic.advanced.Superhero;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class AdvancedAutomaticInjection {

    private final List<Superhero> superheroes;

    public AdvancedAutomaticInjection(List<Superhero> superheroes) {
        this.superheroes = superheroes;
    }

    public String getMessage() {
        StringBuilder builder = new StringBuilder();
        builder.append("Bean messages:\n");
        String message = superheroes.stream()
                .map(superhero -> superhero.getClass().getSimpleName() + " superpowers are " + superhero.getSuperPowers())
                .collect(Collectors.joining("\n"));
        builder.append(message);
        return builder.toString();
    }
}
