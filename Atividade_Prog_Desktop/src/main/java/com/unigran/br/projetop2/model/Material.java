package com.unigran.br.projetop2.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Material implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 30)
    private String nome;

    @Column
    private int quantidade;

    @Column
    private int quantidade_min;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidade_min() {
        return quantidade_min;
    }

    public void setQuantidade_min(int quantidade_min) {
        this.quantidade_min = quantidade_min;
    }
}