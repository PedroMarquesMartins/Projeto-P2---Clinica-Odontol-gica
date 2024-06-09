package com.unigran.br.projetop2.controllers;

import com.unigran.br.projetop2.Dao.PacienteDao;
import com.unigran.br.projetop2.model.Paciente;

import java.util.Date;
import java.util.List;

public class PacienteImplementacao{   //Terá as funções que serão chamadas nas TELAS

    public static void removerPacienteInformado(String nomeInformado)
    {
        PacienteDao PC = new PacienteDao();

        List<Paciente> pacienteList = PC.getListaDados();
        for (Paciente pacienteL : pacienteList)
        {
            if (nomeInformado.equals(pacienteL.getNome())){
                PC.remover(pacienteL);
            }
        }
    }

    public static void listarPacientes()
    {
        PacienteDao PC = new PacienteDao();
        PC.getListaDados(); //PacienteController
    }

    public static void buscarPacienteInformado(String nomeInformado)
    {
        PacienteDao PC = new PacienteDao();
        PC.listaDadosPorNome(nomeInformado);
    }

    public static void buscarPacienteCpfInformado(String cpfInformado)
    {
        PacienteDao PC = new PacienteDao();
        PC.listaDadosPorCpf(cpfInformado);
    }

    public static boolean inserirPaciente(String nome, String cpf , Date dataNasc, String endereco, String convenios, String email, String responsavel) throws Exception {

        if (isValid(nome) && isValid(cpf) && dataNasc != null && isValid(endereco) && isValid(email) && isValid(responsavel)) {
            Paciente paciente = new Paciente();

            paciente.setNome(nome);
            paciente.setCpf(cpf);
            paciente.setDataNascimento(dataNasc);
            paciente.setEndereco(endereco);
            paciente.setConvenios(convenios);
            paciente.setEmail(email);
            paciente.setResponsavel(responsavel);

            PacienteDao pacienteController = new PacienteDao();
            pacienteController.salvar(paciente);
            return true;
        }else{
            System.err.print("Dados insuficientes"); ///TRATAR NA TELA
            return false;
        }
    }

    public static boolean alterarPacienteInformado(String nome, String cpf, Date dataNasc, String endereco, String convenios, String email, String responsavel) throws Exception {
        //Para fazer, o usuario terá que reinserir o paciente com os dados atualizados, e depois, o antigo deverá ser removido.
        //Utilize o inserirPaciente() e o removerPacienteInformado(), dessa mesma classe! Fica show palitão
        if (isValid(nome) && isValid(cpf) && dataNasc != null && isValid(endereco) && isValid(email) && isValid(responsavel)) {
            removerPacienteInformado(nome);
            inserirPaciente(nome, cpf, dataNasc, endereco, convenios, email, responsavel);
            return true;
        }else{
            System.err.print("Dados insuficientes"); ///TRATAR NA TELA
            return false;
        }
    }

    public static boolean isValid(String value) {  //Funçãozinha pro if() ficar melhor
        return value != null && !value.isEmpty();
    }
}