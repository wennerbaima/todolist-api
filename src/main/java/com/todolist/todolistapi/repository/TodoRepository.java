package com.todolist.todolistapi.repository;

import com.todolist.todolistapi.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * REPOSITÓRIO RESPONSÁVEL PELO CRUD DAS TAREFAS
 *
 * @author Wenner
 */
@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {
}
