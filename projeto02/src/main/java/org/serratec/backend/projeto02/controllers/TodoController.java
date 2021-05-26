package org.serratec.backend.projeto02.controllers;

import java.util.List;

import org.serratec.backend.projeto02.models.TodoModel;
import org.serratec.backend.projeto02.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/todo")
public class TodoController {

		@Autowired // injeção de dependências; substitui o new
		TodoService service;

		@GetMapping
		public List<TodoModel> toDo() {
			return service.create();
		}
	}

