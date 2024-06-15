package com.unigran.br.projetop2.model;

import java.time.LocalTime;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-06-15T20:10:22", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Agendamento.class)
public class Agendamento_ { 

    public static volatile SingularAttribute<Agendamento, String> observacao;
    public static volatile SingularAttribute<Agendamento, Date> data;
    public static volatile SingularAttribute<Agendamento, LocalTime> horario;
    public static volatile SingularAttribute<Agendamento, Double> valor;
    public static volatile SingularAttribute<Agendamento, String> NomePaciente;
    public static volatile SingularAttribute<Agendamento, String> NomeDentista;
    public static volatile SingularAttribute<Agendamento, Integer> id;
    public static volatile SingularAttribute<Agendamento, Integer> status;

}