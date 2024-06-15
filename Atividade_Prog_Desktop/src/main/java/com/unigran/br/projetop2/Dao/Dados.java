package com.unigran.br.projetop2.Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class Dados {

    EntityManagerFactory emf
            = Persistence.
            createEntityManagerFactory("br.unigran_Atividade_Prog_Desktop_jar_1.0-SNAPSHOTPU");
    EntityManager em = emf.createEntityManager();
    EntityTransaction etx = em.getTransaction();

    public void salvar(Object o) {
        etx.begin();
        em.persist(o);
        etx.commit();
    }

    public void atualiza(Object o) {
        etx.begin();
        em.merge(o);
        etx.commit();
    }

    public void remove(Object o) {
        etx.begin();
        Class<?> clazz = o.getClass();
        Object id = em.getEntityManagerFactory().getPersistenceUnitUtil().getIdentifier(o);
        Object managedEntity = em.find(clazz, id);
        if (managedEntity != null) {
            em.remove(managedEntity);
        }
        etx.commit();
    }

    //----Sla o que palito fez aqui honestamente-----------------------------------------------------------------
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
