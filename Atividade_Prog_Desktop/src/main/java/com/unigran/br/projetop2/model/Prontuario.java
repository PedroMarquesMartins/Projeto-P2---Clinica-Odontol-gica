package com.unigran.br.projetop2.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

@Getter
@Setter
@Entity
public class Prontuario implements Serializable {

    //Associações

    @OneToMany(mappedBy = "prontuario", cascade = CascadeType.ALL)
    private List<Prontuarios> prontuarios;

    @ManyToOne
    @JoinColumn(name = "paciente_id", referencedColumnName = "id")
    private Paciente paciente;

    //Atributos

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}