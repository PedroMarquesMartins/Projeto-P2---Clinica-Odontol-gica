package com.unigran.br.projetop2.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Getter
@Setter
@Entity
public class Paciente implements Serializable {

    //Associações

    @OneToMany(mappedBy = "paciente", cascade = CascadeType.ALL)
    private List<Prontuario> prontuario;

    @OneToMany(mappedBy = "paciente", cascade = CascadeType.ALL)
    private List<Agendamento> agendamentos;

    //Atributos

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 150)
    private String nome;

    @Column(length = 15)
    private String cpf;

    @Column(name = "data_nasc")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date DataNascimento;

    @Column(length = 150)
    private String endereco;

    @Column(length = 150)
    private String convenios;

    @Column(length = 150)
    private String email;

    @Column(length = 150)
    private String responsavel;
}