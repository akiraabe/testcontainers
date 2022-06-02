package com.example.testcontainers.domain.repository;

import com.example.testcontainers.domain.model.Todo;
import com.example.testcontainers.helper.MySQLContainerInitializer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.core.Is.is;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(initializers = { MySQLContainerInitializer.class })
public class TodoRepositoryTest {

    @Autowired
    TodoRepository todoRepository;

    @Test
    public void test() {
        Iterable<Todo> todos = todoRepository.findAll();
        todos.forEach(System.out::println);
    }
}
