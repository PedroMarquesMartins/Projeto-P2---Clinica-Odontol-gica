package com.unigran.br.projetop2.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@Entity
public class Dentista implements Serializable {

    //Asssociações

    @OneToMany(mappedBy = "dentista", cascade = CascadeType.ALL)
    private Login login;

    @OneToMany(mappedBy = "dentista", cascade = CascadeType.ALL)
    private List<Agendamento> agendamentos;

    //Atributos

    @Id
    @Column(length = 30)
    private String cro;

   @Column(length = 30)
    private String nome;
}