package com.unigran.br.projetop2.controllers;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public interface Controller {
    EntityManagerFactory emf=
            Persistence.
                    createEntityManagerFactory("br.unigran_Atividade_Prog_Desktop_jar_1.0-SNAPSHOTPU");
    EntityManager em =emf.createEntityManager();
    EntityTransaction etx = em.getTransaction();

    public String[] getTitulosColunas();//colunas matriz

    public Object[] getDados(Object o);//array matriz

    public List getListaDados();//lista de dados

    public void remover(Object o);

    public void salvar(Object o) throws Exception;
}