package com.unigran.br.projetop2.model;

import com.unigran.br.projetop2.model.Admin;
import com.unigran.br.projetop2.model.Dentista;
import com.unigran.br.projetop2.model.Gerente;
import com.unigran.br.projetop2.model.Material;
import com.unigran.br.projetop2.model.Recepcionista;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-06-13T00:24:49", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Login.class)
public class Login_ { 

    public static volatile SingularAttribute<Login, Recepcionista> recepcionista;
    public static volatile SingularAttribute<Login, String> senha;
    public static volatile ListAttribute<Login, Material> materiais;
    public static volatile SingularAttribute<Login, Admin> admin;
    public static volatile SingularAttribute<Login, Dentista> dentista;
    public static volatile SingularAttribute<Login, Integer> id;
    public static volatile SingularAttribute<Login, String> login;
    public static volatile SingularAttribute<Login, Integer> permissao;
    public static volatile SingularAttribute<Login, Gerente> gerente;

}