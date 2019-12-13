package com.beyondcoding.springboot.creation.manual;

// No annotation needed, since it will be configured in another class
public class ReusableBean {

    private String message;

    public ReusableBean(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
