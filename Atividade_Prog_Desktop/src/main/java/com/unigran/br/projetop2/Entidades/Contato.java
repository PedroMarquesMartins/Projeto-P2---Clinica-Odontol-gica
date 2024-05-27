package com.unigran.br.projetop2.Entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.io.File;
import java.io.Serializable;

@Entity
public class Contato implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 30)
    private String email;

    @Column(length = 30)
    private String contato1;

    @Column(length = 30)
    private String contato2;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void removerEmail()
    {
        email = null;
    }

    public void removerContato1()
    {
        contato1 = null;
    }

    public void removerContato2()
    {
        contato2 = null;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContato1() {
        return contato1;
    }

    public void setContato1(String contato1) {
        this.contato1 = contato1;
    }

    public String getContato2() {
        return contato2;
    }

    public void setContato2(String contato2) {
        this.contato2 = contato2;
    }
}