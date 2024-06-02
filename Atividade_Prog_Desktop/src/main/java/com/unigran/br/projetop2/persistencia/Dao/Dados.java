package com.unigran.br.projetop2.persistencia.Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class Dados {
    EntityManagerFactory emf=
            Persistence.
                    createEntityManagerFactory("org.example_untitled_jar_1.0-SNAPSHOTPU");
    EntityManager em =emf.createEntityManager();
    EntityTransaction etx = em.getTransaction();

    public void salvar(Object o){
        etx.begin();
        em.persist(o);
        etx.commit();
    }
    public void atualiza(Object o){
        etx.begin();
        em.merge(o);
        etx.commit();
    }

    public void remove(Object o){
        etx.begin();
        em.remove(o);
        etx.commit();
    }





    //----SLA-----------------------------------------------------------------
    public <T> T buscarPorId(Class<T> clazz, Object id) {
        return em.find(clazz, id);
    }

    public <T> List<T> listarTodos(Class<T> clazz, String s) {
        return em.createQuery("SELECT o FROM " + clazz.getSimpleName() + " o", clazz).getResultList();
    }

    public void fechar() {
        if (em != null && em.isOpen()) {
            em.close();
        }
        if (emf != null && emf.isOpen()) {
            emf.close();
        }
    }
}
