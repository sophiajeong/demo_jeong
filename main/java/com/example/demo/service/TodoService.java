package com.example.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.model.TodoEntity;
import com.example.demo.persistence.TodoRepository;

@Service
public class TodoService {
    @Autowired
    private TodoRepository repository;
    public String testService(){
        // Create a new TodoEntity using constructor instead of builder
        TodoEntity entity = new TodoEntity();
        entity.setUserId("Shin Hye-Jeong");
        entity.setTitle("My first todo item");
        // Save the TodoEntity
        repository.save(entity);
        // Search for the saved TodoEntity
        TodoEntity savedEntity = repository.searchByUserId(entity.getUserId()).get(0);
        return savedEntity.getUserId();
    }
}
