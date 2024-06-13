package com.unigran.br.projetop2.Dao;

import com.unigran.br.projetop2.model.Prontuario;
import com.unigran.br.projetop2.model.Prontuarios;
import java.util.List;

public class ProntuarioDao implements Dao {

    @Override
    public String[] getTitulosColunas() {return new String[]{"id", "Paciente"};}

    @Override
    public Object[] getDados(Object o) {
        if (o instanceof Prontuario) {
            Prontuario prontuario = (Prontuario) o;
            return new Object[]{prontuario.getId(), prontuario.getPaciente().getNome()};
        }
        return new Object[0];
    }

    @Override
    public List<Prontuario> getListaDados() {
        return em.createQuery("SELECT p FROM Prontuario p", Prontuario.class)
                .getResultList();
    }

    @Override
    public void remover(Object o) {
        if (o instanceof Prontuario) {
            Prontuario prontuario = (Prontuario) o;
            em.remove(em.contains(prontuario) ? prontuario : em.merge(prontuario));
        }
    }

    @Override
    public void salvar(Object o) throws Exception {
        if (o instanceof Prontuario) {
            Prontuario prontuario = (Prontuario) o;
            em.persist(prontuario);
        } else if (o instanceof Prontuarios) {
            Prontuarios prontuarios = (Prontuarios) o;
            em.persist(prontuarios);
        } else {
            throw new Exception("Não foi possível salvar!");
        }
    }

    public List<Prontuario> listaProntuariosPorPaciente(String nomePaciente) {
        return em.createQuery("SELECT p FROM Prontuario p WHERE p.paciente.nome = :nomePaciente", Prontuario.class)
                .setParameter("nomePaciente", nomePaciente)
                .getResultList();
    }

    public List<Prontuarios> listaProntuariosPorDescricao(String descricao) {
        return em.createQuery("SELECT pr FROM Prontuarios pr WHERE pr.descricao LIKE :descricao", Prontuarios.class)
                .setParameter("descricao", "%" + descricao + "%")
                .getResultList();
    }
}
