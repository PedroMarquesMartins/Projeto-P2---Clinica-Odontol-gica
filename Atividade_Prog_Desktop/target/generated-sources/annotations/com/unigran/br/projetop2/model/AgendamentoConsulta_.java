package com.unigran.br.projetop2.model;

import java.io.File;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-06-06T02:14:34", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Agendamento.class)
public class AgendamentoConsulta_ { 

    public static volatile SingularAttribute<Agendamento, String> observacoes;
    public static volatile SingularAttribute<Agendamento, Date> data;
    public static volatile SingularAttribute<Agendamento, File> anexos;
    public static volatile SingularAttribute<Agendamento, Double> valor;
    public static volatile SingularAttribute<Agendamento, Long> id;
    public static volatile SingularAttribute<Agendamento, Integer> status;

}