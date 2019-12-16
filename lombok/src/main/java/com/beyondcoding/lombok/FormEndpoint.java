package com.beyondcoding.lombok;

import com.beyondcoding.lombok.dataclass.Form;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/forms")
public class FormEndpoint {

    private List<Form> forms = new ArrayList<>();

    @PostConstruct
    public void setup() {
        Form form = Form.builder()
                .firstName("Nelson")
                .lastName("Unknown")
                .nationality(Nationality.FR)
                .arrivalDate(LocalDateTime.now())
                .departureDate(LocalDateTime.now().plusDays(1))
                .id("123123")
                .build();
        forms.add(form);
    }


    @GetMapping
    List<Form> get() {
        return forms;
    }

    @PostMapping
    Form post(@RequestBody Form form) {
        forms.add(form);
        return form;
    }

}
