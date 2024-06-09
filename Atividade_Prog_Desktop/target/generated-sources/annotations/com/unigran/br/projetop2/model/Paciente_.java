package com.unigran.br.projetop2.model;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-06-08T22:50:43", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Paciente.class)
public class Paciente_ { 

    public static volatile SingularAttribute<Paciente, String> endereco;
    public static volatile SingularAttribute<Paciente, Date> DataNascimento;
    public static volatile SingularAttribute<Paciente, String> convenios;
    public static volatile SingularAttribute<Paciente, String> cpf;
    public static volatile SingularAttribute<Paciente, String> nome;
    public static volatile SingularAttribute<Paciente, Long> id;
    public static volatile SingularAttribute<Paciente, String> responsavel;
    public static volatile SingularAttribute<Paciente, String> email;

}