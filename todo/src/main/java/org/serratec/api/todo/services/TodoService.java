package org.serratec.api.todo.services;

import java.util.List;

import org.serratec.api.todo.entities.TodoEntity;
import org.serratec.api.todo.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {
	@Autowired
	TodoRepository todoRepository;
	
	public List<TodoEntity> getAll(){
		return todoRepository.findAll();
	}
	
	public TodoEntity getById(Long id) {
		return todoRepository.findById(id).get();
	}
	
	public void create(TodoEntity todo) {
		todoRepository.save(todo);
	}
	
	public void update(Long id, TodoEntity novoTodo) {
		TodoEntity lukas=getById(id);
		if(novoTodo.getNome()!=null) {
			lukas.setNome(novoTodo.getNome());
		}
		if(novoTodo.getDescricao()!=null) {
			lukas.setDescricao(novoTodo.getDescricao());
		}
		if(novoTodo.getData()!=null) {
			lukas.setData(novoTodo.getData());
		}
		todoRepository.save(lukas);
	}
	
	public void delete(Long id) {
		todoRepository.deleteById(id);
	}

}
