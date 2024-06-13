package com.unigran.br.projetop2.model;

import com.unigran.br.projetop2.model.Agendamento;
import com.unigran.br.projetop2.model.Login;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-06-13T00:24:49", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Gerente.class)
public class Gerente_ { 

    public static volatile ListAttribute<Gerente, Agendamento> agendamentos;
    public static volatile SingularAttribute<Gerente, String> nome;
    public static volatile SingularAttribute<Gerente, Long> id;
    public static volatile SingularAttribute<Gerente, Login> login;

}