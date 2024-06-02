package com.unigran.br.projetop2.Model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Recepcionista implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 30)
    private String nome;

    @OneToOne(cascade = CascadeType.ALL)
    private Login login;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }
}