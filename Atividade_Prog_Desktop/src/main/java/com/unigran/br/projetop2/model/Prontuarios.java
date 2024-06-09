package com.unigran.br.projetop2.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import javax.persistence.*;

@Getter
@Setter
@Entity
public class Prontuarios implements Serializable {

    //Associações

    @ManyToOne
    @JoinColumn(name = "prontuario_id", referencedColumnName = "id")
    private Prontuario prontuario;

    //Atributos

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    private String descricao;

}