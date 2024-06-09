package com.unigran.br.projetop2.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@Entity
public class Gerente implements Serializable {

    //Associações

    @OneToOne(mappedBy = "gerente", cascade = CascadeType.ALL)
    private Login login;

    @OneToMany(mappedBy = "gerente", cascade = CascadeType.ALL)
    private List<Agendamento> agendamentos;

    //Atributos

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 30)
    private String nome;

}