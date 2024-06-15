package com.unigran.br.projetop2.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Dentista implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 30)
    private String cro;  //Observar

    @Column(length = 30)
    private String nome;

    //@OneToOne(cascade = CascadeType.ALL)  //Possivel problema futuro?
    //private Login login;
    public String getCro() {
        return cro;
    }

    public void setCro(String cro) {
        this.cro = cro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    /*public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }*/
}
