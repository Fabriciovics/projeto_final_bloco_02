package com.generation.farmacia.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.List;


@Entity
@Table(name="tb_categoria")
public class Categoria {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(length = 100)
        @NotBlank(message = "O atributo titulo é obrigatorio")
        @Size(min = 10, max = 100, message = "O titulo  deve ter no minimo 10 caracteres e no maximo 500")
        private String titulo;

        @OneToMany(fetch = FetchType.LAZY, mappedBy = "categoria", cascade =  CascadeType.REMOVE)
        @JsonIgnore
        private List<Produto> produtos;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
}
