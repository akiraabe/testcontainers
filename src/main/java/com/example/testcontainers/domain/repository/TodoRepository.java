package com.example.testcontainers.domain.repository;

import com.example.testcontainers.domain.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Integer> {

//    List<Todo> findAllByTitle(String title);

}
