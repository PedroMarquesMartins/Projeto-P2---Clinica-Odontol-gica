package com.unigran.br.projetop2.Dao;

import com.unigran.br.projetop2.model.Material;

import java.util.List;

public class MaterialDao implements Dao {

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
        return em.createNativeQuery("SELECT * FROM material m", Material.class)
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

    public List<Material> listaMaterialPorNome(String nomeMaterial) {
        return em.createQuery("SELECT m FROM Material m WHERE m.nome = :nome", Material.class)
                .setParameter("nome", nomeMaterial)
                .getResultList();
    }

    public void salvarMaterialQnt(String nomeMaterial, Integer qnt) {
        em.getTransaction().begin();
        em.createQuery("UPDATE Material m SET m.quantidade = :quantidade WHERE m.nome = :nome")
                .setParameter("quantidade", qnt)
                .setParameter("nome", nomeMaterial)
                .executeUpdate();
        em.getTransaction().commit();
    }
}
