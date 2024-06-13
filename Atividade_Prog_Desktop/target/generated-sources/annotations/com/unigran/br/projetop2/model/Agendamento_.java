package com.unigran.br.projetop2.model;

import com.unigran.br.projetop2.model.Admin;
import com.unigran.br.projetop2.model.Dentista;
import com.unigran.br.projetop2.model.Gerente;
import com.unigran.br.projetop2.model.Paciente;
import com.unigran.br.projetop2.model.Recepcionista;
import java.time.LocalTime;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-06-13T00:24:49", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Agendamento.class)
public class Agendamento_ { 

    public static volatile SingularAttribute<Agendamento, Recepcionista> recepcionista;
    public static volatile SingularAttribute<Agendamento, String> observacao;
    public static volatile SingularAttribute<Agendamento, Date> data;
    public static volatile SingularAttribute<Agendamento, LocalTime> horario;
    public static volatile SingularAttribute<Agendamento, Paciente> paciente;
    public static volatile SingularAttribute<Agendamento, Double> valor;
    public static volatile SingularAttribute<Agendamento, Admin> admin;
    public static volatile SingularAttribute<Agendamento, Dentista> dentista;
    public static volatile SingularAttribute<Agendamento, Integer> id;
    public static volatile SingularAttribute<Agendamento, Gerente> gerente;
    public static volatile SingularAttribute<Agendamento, Integer> status;

}