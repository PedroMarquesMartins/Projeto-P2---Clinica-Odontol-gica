package com.unigran.br.projetop2.Model;

import javax.persistence.*;
import java.io.Serializable;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Entity
public class Prontuarios implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Prontuario prontuario;

    @ManyToOne
    private Consulta consulta;
    @Lob
    private String descricao;

}