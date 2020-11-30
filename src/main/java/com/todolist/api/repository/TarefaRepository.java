package com.todolist.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.todolist.api.models.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, Long>{
	
	Tarefa findById(long id);

}
