package Main;

import com.unigran.br.projetop2.model.Material;
import com.unigran.br.projetop2.persistencia.implementacao.LoginCadastroImplementacao;
import com.unigran.br.projetop2.persistencia.implementacao.MaterialImplementacao;
import com.unigran.br.projetop2.persistencia.implementacao.PacienteImplementacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class main {
    public static void main(String[] args) throws Exception {

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
        //PacienteImplementacao.removerPacienteInformado("Joao"); ok


        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String nome = "Ana";
        String cpf = "21335603";  //Validar tamanho
        try {
            Date dataNasc = dateFormat.parse("10/09/2012");  //Validar data

            String endereco = "Bairro Monte Olimpo N890 Dourados";
            String convenios = "cONVENJI";
            String email = "EMAILaLTERADO.@FODASE";
            String responsavel = "Ana Responsavel";

            //PacienteImplementacao.inserirPaciente(nome,cpf,dataNasc,endereco,convenios,email,responsavel); OK
            //PacienteImplementacao.alterarPacienteInformado(nome,cpf,dataNasc,endereco,convenios,email,responsavel); OK
            // PacienteImplementacao.inserirPaciente(nome,cpf,dataNasc,endereco,convenios,email,responsavel); okk
        }catch (ParseException e)
        {
            //faz o L
        } catch (Exception e) {
            throw new RuntimeException(e);
        }*/
    }
}