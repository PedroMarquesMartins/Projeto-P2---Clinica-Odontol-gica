/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unigran.br.projetop2.controllers;

import com.unigran.br.projetop2.Dao.AdmDao;
import com.unigran.br.projetop2.model.Administrador;
import java.util.List;


/**
 *
 * @author Pedro
 */
public class AdminImplementacao {
    public static boolean salvarAdm(String nome) throws Exception {
        if (nome != null && !nome.isEmpty()) {
            Administrador administrador = new Administrador();
            administrador.setNome(nome);

            AdmDao admDao= new AdmDao();
            admDao.salvar(administrador);

            return true;
        } else {
            //Deu barba  Retornar pra tela
            System.err.print("Erro ao salvar ADM, dados inválidos ou insuficientes.");
            return false;
        }
    }
    
    public static List<Administrador> listarAdmin() {
    AdmDao adminDao = new AdmDao();
    List<Administrador> adminList = adminDao.getListaDados();
    
    return adminList;
}
}