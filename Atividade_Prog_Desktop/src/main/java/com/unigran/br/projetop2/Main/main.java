package com.unigran.br.projetop2.Main;

import com.unigran.br.projetop2.controllers.DentistaImplementacao;
import com.unigran.br.projetop2.views.TelaLogin;
import com.unigran.br.projetop2.views.TelasAdm.TelaAdministrador;

public class main {
    public static void main(String[] args) throws Exception {
        TelaLogin telalogin = new TelaLogin();
        telalogin.setVisible(true);

        //TelaAdministrador telaAdministrador = new TelaAdministrador();
        //telaAdministrador.setVisible(true);

        //Teste de Dentista a seguir:
        /*
        String nome ="DentistaLucas";
        String cro = "croAQUIMui";
        DentistaImplementacao.salvarDentista(nome,cro);
        */

        //Teste de Agendamento a seguir:
        /*
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date data = dateFormat.parse("12/12/2012");  //Validar data

            String observacoes = "Limpeza";
            Double valor = 390.39;
            Integer h=19;
            Integer m=12;

            //AgendamentoImplementacao.marcarConsulta(data,observacoes,valor,null,h,m);
            //AgendamentoImplementacao.cancelarConsulta(13);
            //AgendamentoImplementacao.concluirConsulta(12);
        }catch (ParseException e)
        {
            //faz o L
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
*/

        //Teste de Material a seguir:
        /*boolean sucesso = MaterialImplementacao.efetuarCadastroMaterial("Alcool",10,1); //OK
        //boolean sucesso2 = MaterialImplementacao.removerQntInformada("Alcool",5); OK
        //MaterialImplementacao.listarMateriais(); //Tá sus... Verificar quando tiver tela!
        //MaterialImplementacao.adicionarQntInformada("Bisturi",2); OK
         */

        //Teste de Login a seguir:
        /*
        LoginCadastroImplementacao.efetuarCadastro("jaoUser", "123", 3); OKK!
        LoginCadastroImplementacao.validaLogin("jaoUser","123"); //Dando problema!

        LoginCadastroImplementacao.validaLogin("jaoUser","123");Okk!
         */

        //Teste de Paciente a Seguir: TA OK!
/*

        //PacienteImplementacao.listarPacientes();  //Testar na Tela!
        //PacienteImplementacao.removerPacienteInformado("Lucas");



        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String nome = "Lucas";
        String cpf = "999995603";  //Validar tamanho
        try {
            Date dataNasc = dateFormat.parse("10/10/2024");  //Validar data

            String endereco = "Rio GRande do SUl";
            String convenios = "Unimed";
            String email = "Lucreia@FODASE";
            String responsavel = "Mae";


            //PacienteImplementacao.alterarPacienteInformado(nome,cpf,dataNasc,endereco,convenios,email,responsavel); OK
            //PacienteImplementacao.inserirPaciente(nome,cpf,dataNasc,endereco,convenios,email,responsavel);
        }catch (ParseException e)
        {
            //faz o L
        } catch (Exception e) {
            throw new RuntimeException(e);
        }*/
    }
}