package com.example.testcontainers.api;

import com.example.testcontainers.domain.model.Todo;
import com.example.testcontainers.domain.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {

    @Autowired
    private TodoService todoService;

    @GetMapping(value = "/")
    public String index() {return "index";}

    @GetMapping(value = "/api/todos")
    public Iterable<Todo> findAll() {
        return todoService.findAll();
    }

    @PostMapping(value = "/api/todos")
    public void save(Todo todo) {
        todoService.save(todo);
    }
}
