package com.unigran.br.projetop2.controllers;

import com.unigran.br.projetop2.Dao.MaterialDao;
import com.unigran.br.projetop2.model.Material;

import java.util.List;

public class MaterialImplementacao {

    public static List<Material> listarMateriais() {
        MaterialDao materiaisDao = new MaterialDao();
        return materiaisDao.getListaDados();
    }

    public static boolean removerQntInformada(String nomeMaterial, Integer quantidadeRemover) throws Exception {
        boolean sucesso = false;
        MaterialDao MC = new MaterialDao();

        List<Material> materialList = MC.getListaDados();
        for (Material materialL : materialList) {
            if (nomeMaterial.equals(materialL.getNome())) {
                Integer qntMaterial = materialL.getQuantidade();

                if (qntMaterial < quantidadeRemover) {
                    System.err.print("Material insuficiente em estoque.");
                    sucesso = false;
                } else {
                    materialL.setQuantidade(qntMaterial - quantidadeRemover);

                    MC.salvarMaterialQnt(nomeMaterial, (qntMaterial - quantidadeRemover));
                    sucesso = true;
                }  //Diminuindo estoque
            }
        }
        if (sucesso != true) {
            System.err.print("Seu item não foi encontrado, ou não há suficiente.");
        }
        return sucesso;   //Retorna para a tela se deu certo
    }

    public static boolean adicionarQntInformada(String nomeMaterial, Integer quantidadeAdicionar) throws Exception {
        boolean sucesso = false;
        MaterialDao MC = new MaterialDao();

        List<Material> materialList = MC.getListaDados();
        for (Material materialL : materialList) {
            if (nomeMaterial.equals(materialL.getNome())) {

                Integer qntMaterial = materialL.getQuantidade();
                if (quantidadeAdicionar < 1) {
                    System.err.print("Você deve adicionar ao menos 1 item.");
                    sucesso = false;
                } else {
                    materialL.setQuantidade(qntMaterial + quantidadeAdicionar);

                    MC.salvarMaterialQnt(nomeMaterial, (qntMaterial + quantidadeAdicionar));
                    sucesso = true;
                }  //Aumentando estoque
            }
        }
        if (sucesso != true) {
            System.err.print("Seu item não foi encontrado!");
        }
        return sucesso;   //Retorna para a tela se deu certo
    }

    public static boolean efetuarCadastroMaterial(String nome, Integer quantEstoque, Integer quantMinima) throws Exception { //ATENÇÃO! Classe tela deve ter tratamento caso retorne false!
        if (nome != null && !nome.isEmpty() && quantEstoque != null && quantMinima != null && quantMinima > -1 && quantEstoque > -1) {
            Material material = new Material();

            material.setNome(nome);
            material.setQuantidade(quantEstoque);
            material.setQuantidade_min(quantMinima);

            MaterialDao materialController = new MaterialDao();
            materialController.salvar(material);

            return true;   //Cadastrado com Sucesso (Mostrar tela)
        } else {
            System.err.print("Dados insuficientes ou inválidos.");
            return false; //Deve aparecer um erro na Tela
        }
    }
}
