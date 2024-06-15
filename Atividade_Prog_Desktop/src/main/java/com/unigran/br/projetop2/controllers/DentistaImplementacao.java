package com.unigran.br.projetop2.controllers;

import com.unigran.br.projetop2.Dao.DentistaDao;
import com.unigran.br.projetop2.model.Dentista;

import java.util.List;

public class DentistaImplementacao {

    public static boolean salvarDentista(String nome) throws Exception {
        if (nome != null && !nome.isEmpty()) {
            Dentista dentista = new Dentista();
            dentista.setNome(nome);

            DentistaDao dentistaDao = new DentistaDao();
            dentistaDao.salvar(dentista);

            return true;
        } else {
            //Deu barba  Retornar pra tela
            System.err.print("Erro ao salvar dentista, dados inválidos ou insuficientes.");
            return false;
        }
    }

    public static List<Dentista> listarDentistas() {
        DentistaDao dentistaDao = new DentistaDao();
        List<Dentista> dentistaList = dentistaDao.getListaDados();

        return dentistaList;
    }
}
