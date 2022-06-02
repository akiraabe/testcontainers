package com.example.testcontainers.domain.service;

import com.example.testcontainers.domain.model.Todo;
import com.example.testcontainers.domain.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    @Transactional
    public void save(Todo todo) {
        todoRepository.save(todo);
    }

    @Transactional(readOnly = true)
    public Iterable<Todo> findAll() {
        return todoRepository.findAll();
    }
}
