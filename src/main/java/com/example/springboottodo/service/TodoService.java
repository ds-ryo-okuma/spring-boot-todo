package com.example.springboottodo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboottodo.entity.Todo;
import com.example.springboottodo.repository.TodoRepository;

@Service
public class TodoService {
	
	@Autowired
	TodoRepository todoRepository;
	
	public Iterable<Todo> serchAll() {
		return todoRepository.findAll();
	}
	
	public void deleteById(Integer id) {
		todoRepository.deleteById(id);
	}
}
