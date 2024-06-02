package com.unigran.br.projetop2.Model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Dentista implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private Integer cro;  //Observar

    @Column(length = 30)
    private String nome;

    @OneToOne(cascade = CascadeType.ALL)  //Possivel problema futuro?
    private Login login;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCro(Integer cro) {
        this.cro = cro;
    }

    public int getCro() {
        return cro;
    }

    public void setCro(int cro) {
        this.cro = cro;
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