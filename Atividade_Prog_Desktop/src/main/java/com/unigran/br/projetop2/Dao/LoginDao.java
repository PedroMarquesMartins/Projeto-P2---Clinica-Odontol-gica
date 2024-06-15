package com.unigran.br.projetop2.Dao;

import com.unigran.br.projetop2.model.Login;

import java.util.List;

public class LoginDao implements Dao {

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
        return em.createNativeQuery("SELECT * FROM login l", Login.class)
                .getResultList();
    }

    @Override
    public void remover(Object o) {
        //Não há como remover um login.
    }

    @Override
    public void salvar(Object o) throws Exception {
        Dados dados = new Dados();
        dados.salvar(o);
    }
}
