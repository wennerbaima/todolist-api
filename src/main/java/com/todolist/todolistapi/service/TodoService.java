package com.todolist.todolistapi.service;

import com.todolist.todolistapi.model.Todo;
import com.todolist.todolistapi.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

/**
 * CLASSE RESPONSÁVEL PELA LÓGICA DAS TAREFAS
 *
 * @author Wenner
 */
@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    public Page<Todo> findAll(Integer pageNum, Integer pageSize, String sortBy) {
        Pageable pageable = PageRequest.of(pageNum, pageSize, Sort.by(sortBy));
        return todoRepository.findAll(pageable);
    }

    public Optional<Todo> findById(Long id) {
        return todoRepository.findById(id);
    }

    public Todo create(Todo todo) {
        todo.setDataCadastro(LocalDate.now());

        return todoRepository.save(todo);
    }

    public Todo update(Todo result, Todo todo) {
        result.setTitulo(todo.getTitulo());
        result.setDescricao(todo.getDescricao());
        result.setConcluido(todo.getConcluido());
        result.setDataEdicao(LocalDate.now());

        return todoRepository.save(result);
    }

    public void deleteById(Long id) {
        todoRepository.deleteById(id);
    }
}
