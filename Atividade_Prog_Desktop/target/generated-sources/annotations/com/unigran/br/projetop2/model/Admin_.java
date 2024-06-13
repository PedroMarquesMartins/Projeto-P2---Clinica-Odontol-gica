package com.unigran.br.projetop2.model;

import com.unigran.br.projetop2.model.Agendamento;
import com.unigran.br.projetop2.model.Login;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-06-13T00:24:49", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Admin.class)
public class Admin_ { 

    public static volatile ListAttribute<Admin, Agendamento> agendamentos;
    public static volatile SingularAttribute<Admin, Long> id;
    public static volatile SingularAttribute<Admin, Login> login;

}