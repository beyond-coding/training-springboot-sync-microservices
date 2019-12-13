package com.beyondcoding.springboot.creation.automatic.basic;

import org.springframework.stereotype.Repository;

@Repository
public class DataManagementBean {

    public String getMessage() {
        return "I'm a data management bean - Repository";
    }

}
