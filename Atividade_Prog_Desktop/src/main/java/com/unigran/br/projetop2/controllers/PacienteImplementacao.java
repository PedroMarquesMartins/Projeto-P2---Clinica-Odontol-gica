package com.unigran.br.projetop2.controllers;

import com.unigran.br.projetop2.Dao.PacienteDao;
import com.unigran.br.projetop2.model.Paciente;
import java.util.Date;
import java.util.List;

public class PacienteImplementacao {   //Terá as funções que serão chamadas nas TELAS

    public static boolean removerPacienteInformado(String nomeInformado) {
        boolean exito = false;
        PacienteDao PC = new PacienteDao();

        List<Paciente> pacienteList = PC.getListaDados();
        for (Paciente pacienteL : pacienteList) {
            if (nomeInformado.equals(pacienteL.getNome())) {
                PC.remover(pacienteL);
                exito = true;
            }
        }
        if (exito == false) {
            return false;
        } else {
            return true;
        }
    }

    public static List<Paciente> listarPacientes() {
        PacienteDao pacienteDao = new PacienteDao();
        return pacienteDao.getListaDados();
    }

    public static void buscarPacienteInformado(String nomeInformado) {
        PacienteDao PC = new PacienteDao();
        PC.listaDadosPorNome(nomeInformado);
    }

    public static void buscarPacienteCpfInformado(String cpfInformado) {
        String nomeInformado = ".";
        PacienteDao PC = new PacienteDao();
        PC.listaDadosPorCpf(cpfInformado);
        buscarPacienteInformado(nomeInformado);
    }

    public static boolean inserirPaciente(String nome, String cpf, Date dataNasc, String endereco, String convenios, String email, String responsavel) throws Exception {

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
        } else {
            System.err.print("Dados insuficientes"); ///TRATAR NA TELA
            return false;
        }
    }

    public static boolean isValid(String value) {  //Funçãozinha pro if() ficar melhor
        return value != null && !value.isEmpty();
    }
}
