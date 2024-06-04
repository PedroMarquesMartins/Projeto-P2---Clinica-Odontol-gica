package com.unigran.br.projetop2.model;

import com.unigran.br.projetop2.model.Dentista;
import com.unigran.br.projetop2.model.Paciente;
import java.io.File;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-06-02T20:20:03", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Consulta.class)
public class Consulta_ { 

    public static volatile SingularAttribute<Consulta, String> observacoes;
    public static volatile SingularAttribute<Consulta, Paciente> paciente;
    public static volatile SingularAttribute<Consulta, File> anexos;
    public static volatile SingularAttribute<Consulta, Double> valor;
    public static volatile SingularAttribute<Consulta, Dentista> dentista;
    public static volatile SingularAttribute<Consulta, Integer> id;

}