package com.unigran.br.projetop2.persistencia.implementacao;

import com.unigran.br.projetop2.controllers.LoginController;
import com.unigran.br.projetop2.model.Login;

import java.util.List;

public class LoginCadastroImplementacao {

    //OBS prática: somente o usuário ADIMINISTRADOR poderá criar cadastros. Na Tela, ele poderá
    //clicar em uma setinha que vai aparecer as permissões de usuários possiveis que ele desejar, e ele vai selecionar uma
    //para fazer aquele cadastro específico, passando o usuario, o login, e a permissão
    public static boolean efetuarCadastro(String user, String senha, Integer permissao) throws Exception { //ATENÇÃO! Classe tela deve ter tratamento caso retorne false!
        if (senha != null && !senha.isEmpty() && user != null && !user.isEmpty() && permissao!=null) {
            Login login = new Login();

            login.setSenha(senha);
            login.setLogin(user);
            login.setPermissao(permissao);

            LoginController loginController = new LoginController();
            loginController.salvar(login);

            return true;   //Cadastrado com Sucesso (Mostrar tela)
        }else {
            System.err.print("Dados insuficientes");
            return false; //Deve aparecer um erro na Tela
        }
    }

    public static void validaLogin(String user,String senha) {
        boolean sucesso;
        sucesso = false;
        if (senha != null && !senha.isEmpty() && user != null && !user.isEmpty()) {
            LoginController LC = new LoginController();
            List<Login> loginList = LC.getListaDados();
            for (Login loginL : loginList) {
                System.out.println("User:"+user+"\nSenha:"+senha);
                if (user.equals(loginL.getLogin())) {
                    if (senha.equals(loginL.getSenha())) {
                        sucesso = true;
                        System.err.print("Logado Com sucesso1");
                        //Qual o tipo de permissão/usuário?

                        //Para descobir... Que tal:
                        int permissao = loginL.getPermissao();

                        //Para fazer isso aqui em cima, vai precisar primeiro adicionar esse campo na entidade e no banc -> tá FEITO :D

                        //Dependendo do tipo, haverá um CASE para cada, chamando as telas de acordo.
                        //Isso serve para separar as funções disponiveis para cada usuario

                        switch(permissao) {
                            case 1:
                                // telaPrincipalPermissão1AtendenteSeila(user).setVisible(true);
                                break;

                            case 2:
                                // telaPrincipalPermissão2DentistaSeilakk(user).setVisible(true);
                                break;

                            case 3:
                                //telaPrincipalGerentePermissão3...
                                break;

                            default:

                                break;
                        }
                    }
                }
            }
        }else{
            //Dados Invalidos // Tratar TELA
            System.err.print("Dados invalidos");
        }

        if (sucesso==false)
        {
            System.err.print("Usuario ou senha inválidos");
        }else {
            System.err.print("Logado Com sucesso2");
        }
    }
}
