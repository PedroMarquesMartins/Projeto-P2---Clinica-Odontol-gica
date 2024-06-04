package com.unigran.br.projetop2.controllers;

import com.unigran.br.projetop2.model.Login;
import com.unigran.br.projetop2.model.Paciente;
import com.unigran.br.projetop2.persistencia.Dao.Dados;

import java.util.List;

public class LoginController implements Controller{
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

    }

    @Override
    public void salvar(Object o) throws Exception {
        Dados dados = new Dados();
        dados.salvar(o);
    }
}
