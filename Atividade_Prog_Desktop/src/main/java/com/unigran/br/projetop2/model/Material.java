package com.unigran.br.projetop2.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
public class Material implements Serializable {

    //Associações

    @ManyToOne
    @JoinColumn(name = "login_id", referencedColumnName = "id")
    private Login login;

    //Atributos

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 30)
    private String nome;

    @Column
    private int quantidade;

    @Column
    private int quantidade_min;

}