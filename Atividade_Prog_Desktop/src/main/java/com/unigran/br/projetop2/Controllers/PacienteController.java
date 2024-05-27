package com.unigran.br.projetop2.Controllers;

import com.unigran.br.projetop2.Entidades.Paciente;

import java.util.List;

public class PacienteController implements Controller{

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
        return em.createNativeQuery("select * from PACIENTE p", Paciente.class)
                .getResultList();
    }

    @Override
    public void remover(Object o) {
        etx.begin();
        em.remove(o);
        etx.commit();
    }

    @Override
    public void salvar(Object o) throws Exception {
        etx.begin();
        em.persist(o);
        etx.commit();
    }
}
