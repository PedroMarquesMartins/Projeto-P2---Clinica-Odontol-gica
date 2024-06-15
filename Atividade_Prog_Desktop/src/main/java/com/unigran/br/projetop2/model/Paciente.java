package com.unigran.br.projetop2.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Paciente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 28)
    private String telefone;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return DataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        DataNascimento = dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getConvenios() {
        return convenios;
    }

    public void setConvenios(String convenios) {
        this.convenios = convenios;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }
}
