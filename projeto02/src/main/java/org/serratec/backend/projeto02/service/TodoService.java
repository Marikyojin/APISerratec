package org.serratec.backend.projeto02.service;

import java.util.List;

import org.serratec.backend.projeto02.models.TodoModel;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

	public List<TodoModel> create() {

		return List.of(new TodoModel(1, "Ir ao mercado", "Ir ao mercado comprar a janta"),
				new TodoModel(2, "Reunião às 16hrs", "Reunião com fulano às 16hrs"));
	}

}
