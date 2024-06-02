package com.unigran.br.projetop2.persistencia.implementacao;

import com.unigran.br.projetop2.Controllers.PacienteController;
import com.unigran.br.projetop2.Model.Paciente;
import com.unigran.br.projetop2.persistencia.Dao.Dados;

import java.util.Date;
import java.util.List;

public class PacienteImplementacao{   //Terá as funções que serão chamadas nas TELAS

    public void removerPacienteInformado(String nomeInformado)
    {
        PacienteController PC = new PacienteController();
        Paciente paciente = new Paciente();

        List<Paciente> pacienteList = PC.getListaDados();
        for (Paciente pacienteL : pacienteList)
        {
            if (nomeInformado.equals(pacienteL.getNome())){
                PC.remover(paciente);
            }
        }
    }

    public void listarPacientes()
    {
        PacienteController PC = new PacienteController();
        PC.getListaDados(); //PacienteController
    }

    public void buscarPacienteInformado(String nomeInformado)
    {
        PacienteController PC = new PacienteController();
        PC.listaDadosPorNome(nomeInformado);
    }

    public void inserirPaciente(String nome, String cpf , Date dataNasc, String endereco, String convenios, String contato, String email, String responsavel) throws Exception {
        Paciente paciente = new Paciente();

        paciente.setNome(nome);
        paciente.setCpf(cpf);
        paciente.setDataNascimento(dataNasc);
        paciente.setEndereco(endereco);
        paciente.setConvenios(convenios);
        paciente.setContato(contato);
        paciente.setEmail(email);
        paciente.setResponsavel(responsavel);

        //testar!
        PacienteController pacienteController = new PacienteController();
        pacienteController.salvar(paciente);
    }

    //FALTA A FUNCAO PARA ALTERAR PACIENTE!!!!!
    public void alterarPacienteInformado(String nome, String cpf , Date dataNasc, String endereco, String convenios, String contato, String email, String responsavel) throws Exception {
        //Para fazer, o usuario terá que reinserir o paciente com os dados atualizados, e depois, o antigo deverá ser removido.
        //Utilize o inserirPaciente() e o removerPacienteInformado(), dessa mesma classe! Fica show palitão
        inserirPaciente(nome,cpf,dataNasc,endereco,convenios,contato,email,responsavel);
        removerPacienteInformado(nome);
    }
}