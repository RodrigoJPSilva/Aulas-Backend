package com.List.ToDo.dto;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;

public class TaskDTO {

    @NotBlank
    private String nome;
    @NotBlank
    private String descricao;
    private String status;
    private LocalDate dtInicio;
    private LocalDate dtFinal;

    public TaskDTO() {
    }

    public TaskDTO(String nome, String descricao, String status, LocalDate dtInicio, LocalDate dtFinal) {
        this.nome = nome;
        this.descricao = descricao;
        this.status = status;
        this.dtInicio = dtInicio;
        this.dtFinal = dtFinal;
    }
}
