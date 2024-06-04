package com.unigran.br.projetop2.model;

import com.unigran.br.projetop2.model.Dentista;
import com.unigran.br.projetop2.model.Paciente;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-06-02T20:20:03", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Agendamento.class)
public class Agendamento_ { 

    public static volatile SingularAttribute<Agendamento, Date> data;
    public static volatile SingularAttribute<Agendamento, Paciente> paciente;
    public static volatile SingularAttribute<Agendamento, Dentista> dentista;
    public static volatile SingularAttribute<Agendamento, Long> id;

}