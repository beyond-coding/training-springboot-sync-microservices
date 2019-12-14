package com.beyondcoding.data.todos;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/todos")
public class TodosEndpoint {

    private final TodoRepository todoRepository;

    public TodosEndpoint(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @GetMapping
    List<Todo> all() {
        return todoRepository.findAll();
    }

    @PostMapping
    Todo add(@RequestBody Todo todo) {
        return todoRepository.save(todo);
    }

    @PutMapping("/{name}/done")
    Todo done(@PathVariable String name) {
        Optional<Todo> oTodo = todoRepository.findByName(name);
        if (!oTodo.isPresent()) {
            return null;
        }
        oTodo.get().setDone(true);
        return todoRepository.save(oTodo.get());
    }

    @GetMapping("/{name}")
    Todo get(@PathVariable String name) {
        return todoRepository.findByName(name).orElse(null);
    }

}
