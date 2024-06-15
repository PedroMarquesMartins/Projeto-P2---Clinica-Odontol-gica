package com.unigran.br.projetop2.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Prontuario implements Serializable {

    @OneToMany(mappedBy = "prontuario")
    private List<Prontuarios> prontuarios;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Paciente paciente;

    public List<Prontuarios> getProntuarios() {
        return prontuarios;
    }

    public void setProntuarios(List<Prontuarios> prontuarios) {
        this.prontuarios = prontuarios;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}