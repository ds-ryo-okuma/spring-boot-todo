package com.example.springboottodo.form;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class TodoForm {

	@NotNull
	@Size(min=2, max=30)
	private String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "Todo(Name: " + this.name + ")";
	}
}