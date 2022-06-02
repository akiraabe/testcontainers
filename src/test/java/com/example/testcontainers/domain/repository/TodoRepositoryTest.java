package com.example.testcontainers.domain.repository;

import com.example.testcontainers.domain.model.Todo;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test; // jupiterの@Testを指定すること！！
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.jdbc.Sql;
import org.testcontainers.junit.jupiter.Testcontainers;

@Testcontainers
@DataJpaTest(excludeAutoConfiguration = AutoConfigureTestDatabase.class)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class TodoRepositoryTest {

    @Autowired
    private TodoRepository todoRepository;

    @Test
    @Sql(scripts = "classpath:/scripts/init.sql")
    public void test() {
        List<Todo> todos = todoRepository.findAll();
        
        todos.forEach(System.out::println);
        Assertions.assertThat(todos.size()).isEqualTo(3);
    }
}
