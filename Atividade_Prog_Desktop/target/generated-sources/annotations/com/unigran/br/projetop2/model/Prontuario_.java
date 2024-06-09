package com.unigran.br.projetop2.model;

import com.unigran.br.projetop2.model.Paciente;
import com.unigran.br.projetop2.model.Prontuarios;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-06-08T22:50:43", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Prontuario.class)
public class Prontuario_ { 

    public static volatile SingularAttribute<Prontuario, Paciente> paciente;
    public static volatile SingularAttribute<Prontuario, Long> id;
    public static volatile ListAttribute<Prontuario, Prontuarios> prontuarios;

}