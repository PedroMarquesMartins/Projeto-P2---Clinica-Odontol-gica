package com.unigran.br.projetop2.Persistencia.Padrao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class Dao {
    private static Dao instancia;
    private final EntityManagerFactory emf;
    private final EntityManager em;

    private Dao() {
        emf = Persistence.createEntityManagerFactory("br.unigran_ProjetoP2_jar_1.0-SNAPSHOTPU");
        em = emf.createEntityManager();
    }

    public static Dao getInstace() {
        if (instancia == null) {
            instancia = new Dao();
        }
        return instancia;
    }

    public EntityManager getEm() {
        return em;
    }

    public Object salvar(Object o) {
        em.getTransaction().begin();
        em.persist(o);
        em.getTransaction().commit();
        return o;
    }

    public Object atualizar(Object o) {
        em.getTransaction().begin();
        Object retorno = em.merge(o);
        em.getTransaction().commit();
        return retorno;
    }

    public void remover(Object o, Class clazz) {
        em.getTransaction().begin();
        em.remove(em.contains(o) ? o : em.merge(o));
        em.getTransaction().commit();
    }

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
