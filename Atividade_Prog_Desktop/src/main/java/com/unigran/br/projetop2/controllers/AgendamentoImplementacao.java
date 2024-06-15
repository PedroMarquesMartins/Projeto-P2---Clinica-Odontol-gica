package com.unigran.br.projetop2.controllers;

import com.unigran.br.projetop2.Dao.AgendamentoDao;
import com.unigran.br.projetop2.Dao.DentistaDao;
import com.unigran.br.projetop2.Dao.PacienteDao;
import com.unigran.br.projetop2.model.Agendamento;
import com.unigran.br.projetop2.model.Dentista;
import com.unigran.br.projetop2.model.Paciente;

import java.io.File;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

public class AgendamentoImplementacao {

    public static boolean marcarConsulta(Date data, String observacoes, Double valor, Integer h, Integer m,String NomePaciente, String NomeDentista) throws Exception { //E agendar horario
        //Cria um agendamento de consulta no banco, ao mesmo tempo que registraConsulta()

        if (data != null && isValid(observacoes) && valor != null && h != null && m != null && h < 24 && h > 0 && m < 60 && m > 0) {
            int status = 1;   //Informando que o status é obrigatoriamente "Agendado(1)", ao invés de "Cancelado(2)" ou "Concluido(3)" //Deve ter o status de AGENDADO, obrigatoriamente.
            boolean sucess = registrarConsulta(data, observacoes, valor, null, status, h, m,NomePaciente,NomeDentista);
            if(sucess!=true){
                return false;
            }
            System.err.print("É Válido");
            return true;
        } else {
            System.err.print("\nDados insuficientes");
            return false; //Dados inválidos ou insuficientes;
        }
    }

    public static List<Agendamento> listarConsultas() {
        AgendamentoDao agendamentoDao = new AgendamentoDao();
        return agendamentoDao.getListaDados();
    }

    public static boolean cancelarConsulta(Integer id) {
        //Muda o status para cancelada
        AgendamentoDao agendamentoController = new AgendamentoDao();
        agendamentoController.salvarStatus(id, 2);
        return true; //Tela: Deu bom
    }

    public static boolean concluirConsulta(Integer id) {
        AgendamentoDao agendamentoController = new AgendamentoDao();
        agendamentoController.salvarStatus(id, 3);
        return true;
    }

    public static boolean registrarConsulta(Date data, String observacoes, Double valor, File anexos, Integer status, int h, int m,String NomePaciente, String NomeDentista) throws Exception { //De fato salva no banco
        //Salvar na tabela a consulta agendada (concluida ou não, cancelada ou não), informando os nomes dos envolvidos.
        // Toda consulta precisa ser registrada.
        //Deve ter um status de AGENDADO, CONCLUIDO ou CANCELADA.
        boolean sucesso1,sucesso2;
        sucesso1 = false;
        sucesso2 = false;

        PacienteDao PD = new PacienteDao();
        List <Paciente> pacientesList = PD.getListaDados();
        for(Paciente pacienteL : pacientesList){
            if(pacienteL.getNome().equals(NomePaciente)){
                sucesso1 = true;
            }
        }

        DentistaDao DD = new DentistaDao();
        List <Dentista> dentistaList = DD.getListaDados();
        for (Dentista dentistaL : dentistaList){
            if(dentistaL.getNome().equals(NomeDentista)){
                sucesso2= true;
            }
        }

        if(sucesso1 == true && sucesso2 == true){
            Agendamento agendamento = new Agendamento();

            agendamento.setData(data);
            agendamento.setObservacao(observacoes);
            agendamento.setValor(valor);
            //agendamento.setAnexos(anexos);
            agendamento.setNomePaciente(NomePaciente);
            agendamento.setNomeDentista(NomeDentista);
            agendamento.setStatus(status);
            agendamento.setHorario(LocalTime.of(h, m));

            AgendamentoDao agendamentoController = new AgendamentoDao();
            agendamentoController.salvar(agendamento); //Salva
            System.err.print("\nSalvo com sucesso");

            return true;
        }else{
            System.err.print("\nNão há dentistas ou pacientes com esse nome.");
            return false;
        }
    }

    public static boolean isValid(String value) {  //Funçãozinha pro if() ficar melhor
        return value != null && !value.isEmpty();
    }
}
