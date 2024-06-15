package com.unigran.br.projetop2.controllers;

import com.unigran.br.projetop2.Dao.LoginDao;
import com.unigran.br.projetop2.model.Login;

import java.util.List;

public class CadastroImplementacao {

    //OBS prática: somente o usuário ADIMINISTRADOR poderá criar cadastros. Na Tela, ele poderá
    //clicar em uma setinha que vai aparecer as permissões de usuários possiveis que ele desejar, e ele vai selecionar uma
    //para fazer aquele cadastro específico, passando o usuario, o login, e a permissão
    public static int efetuarCadastro(String user, String senha, Integer permissao) throws Exception { //ATENÇÃO! Classe tela deve ter tratamento caso retorne false!
        boolean encontrou = false;
        if (senha != null && !senha.isEmpty() && user != null && !user.isEmpty() && permissao != null) {
            LoginDao LD = new LoginDao();
            List<Login> loginList = LD.getListaDados();
            for (Login loginL : loginList) {
                if (user.equals(loginL.getLogin())) {
                    encontrou = true;
                }
            }

            if (encontrou == true) {
                return 3;
            } else {
                Login login = new Login();

                login.setSenha(senha);
                login.setLogin(user);
                login.setPermissao(permissao);

                LoginDao loginController = new LoginDao();
                loginController.salvar(login);

                return 1;   //Cadastrado com Sucesso (Mostrar tela)
            }
        } else {
            System.err.print("Dados insuficientes");
            return 2; //Deve aparecer um erro na Tela
        }
    }
}
