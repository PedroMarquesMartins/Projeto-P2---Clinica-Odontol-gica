/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unigran.br.projetop2.controllers;

import com.unigran.br.projetop2.Dao.GerenteDao;
import com.unigran.br.projetop2.model.Gerente;
import java.util.List;



/**
 *
 * @author Pedro
 */
public class GerenteImplementacao {
    public static boolean salvarNome(String nome) throws Exception {
        if (nome != null && !nome.isEmpty()) {
            Gerente gerente = new Gerente();
            gerente.setNome(nome);

            GerenteDao gerenteDao = new GerenteDao();
            gerenteDao.salvar(gerente);

            return true;
        } else {
            //Deu barba  Retornar pra tela
            System.err.print("Erro ao salvar Gerente, dados inválidos ou insuficientes.");
            return false;
        }
    }
    
    public static List<Gerente> listarGerente() {
    GerenteDao gerenteDao = new GerenteDao();
    List<Gerente> gerenteList = gerenteDao.getListaDados();
    
    return gerenteList;
}
}
