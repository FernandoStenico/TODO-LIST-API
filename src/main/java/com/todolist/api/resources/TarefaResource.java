package com.todolist.api.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.todolist.api.models.Tarefa;
import com.todolist.api.repository.TarefaRepository;

@RestController
@RequestMapping(value="/api")
public class TarefaResource {

	@Autowired
	TarefaRepository tarefaRepository;
	
	@GetMapping("/tarefa")
	public List<Tarefa> listaTarefas(){
		return tarefaRepository.findAll();
	}

	@GetMapping("/tarefa/{id}")
	public Tarefa listaTarefaUnica(@PathVariable(value="id") long id){
		return tarefaRepository.findById(id);
	}
	
	@PostMapping("/tarefa")
	public Tarefa salvatarefa(@RequestBody Tarefa tarefa) {
		return tarefaRepository.save(tarefa);
	}
	
	@DeleteMapping("/tarefa")
	public void deletaTarefa(@RequestBody Tarefa tarefa) {
		tarefaRepository.delete(tarefa);
	}
	
	@PutMapping("/tarefa")
	public Tarefa atualizaTarefa(@RequestBody Tarefa tarefa) {
		return tarefaRepository.save(tarefa);
	}
}
