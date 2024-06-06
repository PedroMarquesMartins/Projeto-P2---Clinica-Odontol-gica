package com.unigran.br.projetop2.controllers;

import com.unigran.br.projetop2.model.Agendamento;
import com.unigran.br.projetop2.persistencia.Dao.Dados;

import java.util.List;

public class AgendamentoController implements Controller {

    @Override
    public String[] getTitulosColunas() {
        return new String[0];
    }

    @Override
    public Object[] getDados(Object o) {
        return new Object[0];
    }

    @Override
    public List getListaDados() {
        return em.createNativeQuery("SELECT * FROM agendamento a", Agendamento.class)
                .getResultList();
    }

    @Override
    public void remover(Object o) {
        Dados dados = new Dados();
        dados.remove(o);
    }

    @Override
    public void salvar(Object o) throws Exception {
        Dados dados = new Dados();
        dados.salvar(o);
    }

    public void salvarStatus(Integer id,Integer status){
        em.getTransaction().begin();
        em.createQuery("UPDATE Agendamento a SET a.status = :status WHERE a.id = :id")
                .setParameter("status", status)
                .setParameter("id", id)
                .executeUpdate();
        em.getTransaction().commit();
    }
}
