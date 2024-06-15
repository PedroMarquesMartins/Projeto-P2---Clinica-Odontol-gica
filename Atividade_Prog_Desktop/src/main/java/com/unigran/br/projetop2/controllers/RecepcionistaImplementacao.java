/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unigran.br.projetop2.controllers;

import com.unigran.br.projetop2.Dao.RecepcionistaDao;
import com.unigran.br.projetop2.model.Recepcionista;
import java.util.List;

/**
 *
 * @author Pedro
 */
public class RecepcionistaImplementacao {
    public static boolean salvarNome(String nome) throws Exception {
        if (nome != null && !nome.isEmpty()) {
            Recepcionista recepcionista = new Recepcionista();
            recepcionista.setNome(nome);

            RecepcionistaDao recepcionistaDao= new RecepcionistaDao();
            recepcionistaDao.salvar(recepcionista);

            return true;
        } else {
            //Deu barba  Retornar pra tela
            System.err.print("Erro ao salvar Recepcionista, dados inválidos ou insuficientes.");
            return false;
        }
    }
    
    public static List <Recepcionista> listarRecepcionista(){
        RecepcionistaDao recepcionistaDao = new RecepcionistaDao();
        List<Recepcionista> recepcionistaList = recepcionistaDao.getListaDados();
        
        return recepcionistaList;
    }
}
