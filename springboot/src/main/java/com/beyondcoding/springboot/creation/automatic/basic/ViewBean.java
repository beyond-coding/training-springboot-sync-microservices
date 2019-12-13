package com.beyondcoding.springboot.creation.automatic.basic;

import org.springframework.stereotype.Controller;

@Controller
public class ViewBean {

    public String getMessage() {
        return "I'm a view bean - Controller";
    }

}
