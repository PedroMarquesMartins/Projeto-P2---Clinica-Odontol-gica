package com.unigran.br.projetop2.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@Entity
public class Login implements Serializable {

    // Associações

    @OneToOne(mappedBy = "login")
    @JoinColumn(name = "admin_id", referencedColumnName = "id")
    private Admin admin;

    @OneToOne(mappedBy = "login")
    @JoinColumn(name = "recepcionista_id", referencedColumnName = "id")
    private Recepcionista recepcionista;

    @OneToOne(mappedBy = "login")
    @JoinColumn(name = "gerente_id", referencedColumnName = "id")
    private Gerente gerente;

    @OneToOne(mappedBy = "login")
    @JoinColumn(name = "dentista_id", referencedColumnName = "id")
    private Dentista dentista;

    @OneToMany(mappedBy = "login", cascade = CascadeType.ALL)
    private List<Material> materiais;

    // Atributos

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 30, unique = true, nullable = false)
    private String login;

    @Column(length = 30, nullable = false)
    private String senha;

    @Column(nullable = false)
    private Integer permissao;
}
