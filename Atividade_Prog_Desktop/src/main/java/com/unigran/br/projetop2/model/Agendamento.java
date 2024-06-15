package com.unigran.br.projetop2.model;

import javax.persistence.*;
import java.io.File;
import java.io.Serializable;
import java.time.LocalTime;
import java.util.Date;

@Entity
public class Agendamento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    //// @ManyToOne
    // @JoinColumn(name = "paciente_id")
    // private Paciente paciente;
    // @ManyToOne
    // @JoinColumn(name = "dentista_cro")
    // private Dentista dentista;
    @Temporal(TemporalType.TIMESTAMP)
    private Date data;

    @Column(length = 500)
    private String observacao;

    @Column(length = 500)
    private String NomePaciente;

    @Column(length = 500)
    private String NomeDentista;

    @Column
    private Integer status;

    @Column
    private double valor;

    @Column(name = "horario")
    private LocalTime horario;

    public String getNomePaciente() {
        return NomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        NomePaciente = nomePaciente;
    }

    public String getNomeDentista() {
        return NomeDentista;
    }

    public void setNomeDentista(String nomeDentista) {
        NomeDentista = nomeDentista;
    }

    //private File anexos;  //Observar
    public Integer getStatus() {
        return status;
    }

    public LocalTime getHorario() {
        return horario;
    }

    public void setHorario(LocalTime horario) {
        this.horario = horario;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
