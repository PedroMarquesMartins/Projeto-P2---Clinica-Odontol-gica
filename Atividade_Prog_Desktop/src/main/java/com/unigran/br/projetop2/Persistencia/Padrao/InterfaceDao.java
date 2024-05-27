package com.unigran.br.projetop2.Persistencia.Padrao;
import com.unigran.br.projetop2.Persistencia.Padrao.Dao;

import java.util.List;

public interface InterfaceDao {
    public default void salvar(Object entidade) {
        Dao.getInstace().salvar(entidade);
    }

    public default void atualiza(Object entidade) {
        Dao.getInstace().atualizar(entidade);
    }

    public default void remove(Object entidade, Class clazz) {
        Dao.getInstace().remover(entidade, clazz);
    }

    public default void remove(Integer id,Class clazz){
        Dao.getInstace ().remover(id,clazz);
    }
    public default List listar(Class clazz,String where){
        return Dao.getInstace ().listarTodos(clazz, where);
    }
    public default List listar(Class clazz){
        return Dao.getInstace ().listarTodos(clazz, "");
    }
}
