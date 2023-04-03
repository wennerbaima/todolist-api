package com.todolist.todolistapi.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

/**
 * ENTIDADE QUE REPRESENTA AS TAREFAS
 *
 * @author Wenner
 */
@Entity
@Table(name = "todo", schema = "system")
@Data
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    private String descricao;

    @Column(name="data_cadastro")
    private LocalDate dataCadastro;

    @Column(name="data_edicao")
    private LocalDate dataEdicao;

    private Boolean concluido;
}
