package org.serratec.api.todo.controllers;

import java.util.List;

import org.serratec.api.todo.entities.TodoEntity;
import org.serratec.api.todo.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TodoController {
	@Autowired
	TodoService todoService;
	
	@GetMapping
	public List<TodoEntity> mostrarTudo() {
		return todoService.getAll();
	}
	
	@GetMapping("/{id}")
	public TodoEntity mostrarUm(@PathVariable Long id) {
		return todoService.getById(id);
	}
	
	@PostMapping
	public void criar(@RequestBody TodoEntity todo) {
		todoService.create(todo);
	}
	
	@PutMapping("/{id}")
	public void atualizar(@PathVariable Long id, @RequestBody TodoEntity todo) {
		todoService.update(id, todo);
	}
	
	@DeleteMapping("/{id}")
	public void apagar(@PathVariable Long id) {
		todoService.delete(id);
	}

}
