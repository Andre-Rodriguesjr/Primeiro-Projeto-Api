package com.example.cinema.entity;

import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class Filme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String titulo;

    @NotBlank
    private String diretor;

    @NotBlank
    private String genero;

    @Min(1900)
    private int ano;

    @Min(0)
    @Max(10)
    private double nota;

    public Filme(Long id, String titulo, String diretor, String genero, int ano, double nota) {
        this.id = id;
        this.titulo = titulo;
        this.diretor = diretor;
        this.genero = genero;
        this.ano = ano;
        this.nota = nota;
    }

    public Filme() {

    }
}
