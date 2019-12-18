package com.beyondcoding.data.todos;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Todo {

    @Id
    private String id;
    private String name;
    private boolean done;
}
