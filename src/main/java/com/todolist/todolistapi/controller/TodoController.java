package com.todolist.todolistapi.controller;

import com.todolist.todolistapi.model.Todo;
import com.todolist.todolistapi.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * CLASSE RESPONSÁVEL POR CONTROLAR AS REQUISIÇÕES REFERENTES ÀS TAREFAs
 *
 * @author Wenner
 */
@RestController
@RequestMapping("/todo")
@CrossOrigin(origins = "*")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @GetMapping
    public ResponseEntity<Page<Todo>> findAll(@RequestParam(defaultValue = "0") Integer pageNum,
        @RequestParam(defaultValue = "100") Integer pageSize,
        @RequestParam(defaultValue = "id") String sortBy) {
        return ResponseEntity.ok().body(todoService.findAll(pageNum, pageSize, sortBy));
    }

    @GetMapping(value = "{id}")
    public ResponseEntity<Todo> findById(@PathVariable Long id) {
        return todoService.findById(id)
                .map(result -> ResponseEntity.ok().body(result))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Todo create(@RequestBody Todo todo) {
        return todoService.create(todo);
    }

    @PutMapping(value = "{id}")
    public ResponseEntity<Todo> update(@PathVariable Long id, @RequestBody Todo todo) {
        return todoService.findById(id)
                .map(result -> ResponseEntity.ok().body(todoService.update(result, todo)))
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping(value = "{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id) {
        return todoService.findById(id)
                .map(result -> {
                    todoService.deleteById(id);
                    return ResponseEntity.ok().build();
                })
                .orElse(ResponseEntity.notFound().build());
    }
}
