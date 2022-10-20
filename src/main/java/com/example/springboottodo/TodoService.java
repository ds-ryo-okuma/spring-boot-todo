package com.example.springboottodo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
