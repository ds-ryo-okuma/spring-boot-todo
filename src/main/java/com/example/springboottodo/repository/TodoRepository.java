package com.example.springboottodo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.springboottodo.entity.Todo;

public interface TodoRepository extends CrudRepository<Todo, Integer> {

}
