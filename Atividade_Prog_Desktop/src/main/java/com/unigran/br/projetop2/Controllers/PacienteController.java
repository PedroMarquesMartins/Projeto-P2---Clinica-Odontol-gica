package com.unigran.br.projetop2.Controllers;

import com.unigran.br.projetop2.Model.Paciente;
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

        //Ou seria    dados.remove(paciente);    ???? Veremos
    }

    @Override
    public void salvar(Object o) throws Exception {
        Dados dados = new Dados();
        dados.salvar(o);
    }

    public List<Paciente> listaDadosPorNome(String nomeInformado) {
        return em.createQuery("SELECT p FROM paciente p WHERE p.nome = :nome", Paciente.class)
                .setParameter("nome", nomeInformado)
                .getResultList();
    }
}
