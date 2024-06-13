package com.unigran.br.projetop2.controllers;

import com.unigran.br.projetop2.Dao.LoginDao;
import com.unigran.br.projetop2.model.Login;

public class CadastroImplementacao {
    //OBS prática: somente o usuário ADIMINISTRADOR poderá criar cadastros. Na Tela, ele poderá
    //clicar em uma setinha que vai aparecer as permissões de usuários possiveis que ele desejar, e ele vai selecionar uma
    //para fazer aquele cadastro específico, passando o usuario, o login, e a permissão
    public static boolean efetuarCadastro(String user, String senha, Integer permissao) throws Exception { //ATENÇÃO! Classe tela deve ter tratamento caso retorne false!
        if (senha != null && !senha.isEmpty() && user != null && !user.isEmpty() && permissao!=null) {
            Login login = new Login();

            login.setSenha(senha);
            login.setLogin(user);
            login.setPermissao(permissao);

            LoginDao loginController = new LoginDao();
            loginController.salvar(login);

            return true;   //Cadastrado com Sucesso (Mostrar tela)
        }else {
            System.err.print("Dados insuficientes");
            return false; //Deve aparecer um erro na Tela
        }
    }

    public static void administrarCadastros(){


    }

    public static Integer verificaPermissao(String permissao){
        Integer permissaoInteger;

        switch (permissao){
            case "Administrador":
                permissaoInteger=1;
                break;

            case "Dentista":
                permissaoInteger=2;
                break;

            case "Gerente":
                permissaoInteger=3;
                break;

            case "Recepcionista":
                permissaoInteger=4;
                break;

            default:
                permissaoInteger=100;
                break;
        }

        return permissaoInteger;
    }
}
