package com.unigran.br.projetop2.controllers;

import com.unigran.br.projetop2.model.Paciente;
import com.unigran.br.projetop2.persistencia.Dao.Dados;

import java.util.List;

public class PacienteController implements Controller{

    @Override
    public String[] getTitulosColunas() {
        return new String[]{"id", "Nome"};
    }

    @Override
    public Object[] getDados(Object o) {
        return new Object[0];
    }

    @Override
    public List getListaDados() {
        return em.createNativeQuery("SELECT * FROM paciente p",Paciente.class)
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

    public List<Paciente> listaDadosPorNome(String nomeInformado) {
        return em.createQuery("SELECT p FROM Paciente p WHERE p.nome = :nome", Paciente.class)
                .setParameter("nome", nomeInformado)
                .getResultList();
    }

    public List<Paciente> listaDadosPorCpf(String cpfInformado) {
        return em.createQuery("SELECT p FROM Paciente p WHERE p.cpf = :cpf", Paciente.class)
                .setParameter("cpf", cpfInformado)
                .getResultList();
    }
}
