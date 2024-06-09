package com.unigran.br.projetop2.controllers;

import com.unigran.br.projetop2.Dao.LoginDao;
import com.unigran.br.projetop2.model.Login;
import com.unigran.br.projetop2.views.TelasAdm.TelaAdministrador;

import java.util.List;

public class LoginImplementacao {
    public static boolean validaLogin(String user,String senha) {
        boolean sucesso;
        sucesso = false;
        if (senha != null && !senha.isEmpty() && user != null && !user.isEmpty()) {
            LoginDao LC = new LoginDao();
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
                                System.out.print("ALOOOOOOOOOOOOOOO");
                                new TelaAdministrador().setVisible(true);
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
            return false;
        }

        if (sucesso==false)
        {
            System.err.print("Usuario ou senha inválidos");
            return false;
        }else {
            System.err.print("Logado Com sucesso2");
            return true;
        }
    }
}
