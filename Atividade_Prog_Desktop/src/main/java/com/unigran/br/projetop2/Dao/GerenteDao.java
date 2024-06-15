package com.unigran.br.projetop2.Dao;

import com.unigran.br.projetop2.model.Agendamento;
import com.unigran.br.projetop2.model.Dentista;
import com.unigran.br.projetop2.model.Gerente;

import java.util.List;

public class GerenteDao implements Dao {

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
        return em.createNativeQuery("SELECT * FROM gerente g", Gerente.class)
                .getResultList();
    }

    @Override
    public void remover(Object o) {
    }

    @Override
    public void salvar(Object o) throws Exception {
        Dados dados = new Dados();
        dados.salvar(o);
    }
}
