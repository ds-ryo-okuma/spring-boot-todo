package com.example.springboottodo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboottodo.entity.Todo;
import com.example.springboottodo.repository.TodoRepository;

@Service
public class TodoService {
	
	@Autowired
	TodoRepository todoRepository;
	
	public void save(Todo todo) {
		todoRepository.save(todo);
	}
	
	public Iterable<Todo> serchAll() {
		return todoRepository.findAll();
	}
	
	public Optional<Todo> findById(Integer id) {
		return todoRepository.findById(id);
	}
	
	public void deleteById(Integer id) {
		todoRepository.deleteById(id);
	}
}
