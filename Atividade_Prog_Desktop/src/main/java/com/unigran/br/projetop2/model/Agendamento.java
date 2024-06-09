package com.unigran.br.projetop2.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalTime;
import java.util.Date;

@Getter
@Setter
@Entity
public class Agendamento implements Serializable {

    //Associações

    @ManyToOne
    @JoinColumn(name = "admin_id", referencedColumnName = "id")
    private Admin admin;

    @ManyToOne
    @JoinColumn(name = "recepcionista_id", referencedColumnName = "id")
    private Recepcionista recepcionista;

    @ManyToOne
    @JoinColumn(name = "gerente_id", referencedColumnName = "id")
    private Gerente gerente;

    @ManyToOne
    @JoinColumn(name = "paciente_id", referencedColumnName = "id")
    private Paciente paciente;

    @ManyToOne
    @JoinColumn(name = "dentista_cro", referencedColumnName = "cro")
    private Dentista dentista;

    //Atributos

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date data;

    @Column(length = 500)
    private String observacao;

    @Column
    private  Integer status;

    @Column
    private double valor;

    @Column(name = "horario")
    private LocalTime horario;

    //private File anexos;  //Observar

}