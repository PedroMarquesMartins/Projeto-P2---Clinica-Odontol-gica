package com.unigran.br.projetop2.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

@Getter
@Setter
@Entity
public class Admin implements Serializable {

    // Associações

    @OneToOne(mappedBy = "admin", cascade = CascadeType.ALL)
    private Login login;

    @OneToMany(mappedBy = "admin", cascade = CascadeType.ALL)
    private List<Agendamento> agendamentos;

    // Atributos

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
