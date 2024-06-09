package com.unigran.br.projetop2.controllers;

import com.unigran.br.projetop2.Dao.AgendamentoDao;
import com.unigran.br.projetop2.model.Agendamento;

import java.io.File;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

public class AgendamentoImplementacao {
    public static boolean marcarConsulta(Date data, String observacoes, Double valor, File anexos,Integer h,Integer m) throws Exception { //E agendar horario
        //Cria um agendamento de consulta no banco, ao mesmo tempo que registraConsulta()

        if(data!=null && isValid(observacoes) && valor!=null && h!=null && m!=null && h<24 && h>0 && m<60 && m>0){
            int status=1;   //Informando que o status é obrigatoriamente "Agendado(1)", ao invés de "Cancelado(2)" ou "Concluido(3)" //Deve ter o status de AGENDADO, obrigatoriamente.
            registrarConsulta(data, observacoes, valor, anexos, status,h,m);
            System.err.print("É Válido");
            return true;
        }else{
            System.err.print("\nDados insuficientes");
            return false; //Dados inválidos ou insuficientes;
        }
    }

    public static String listarConsulta(){
        AgendamentoDao AC = new AgendamentoDao();
        AC.getListaDados();

        List<Agendamento> agendamentoList = AC.getListaDados();
        for(Agendamento agendamentoL : agendamentoList){
            Integer statusRecebido;
            String statusStr=null;
            statusRecebido= agendamentoL.getStatus();

            switch (statusRecebido){
                case 1:
                    statusStr="Agendada";
                    break;

                case 2:
                    statusStr="Cancelada";
                    break;

                case 3:
                    statusStr="Concluida";
                    break;

                default:
                    System.err.print("Default");
                    break;
            }
            return statusStr;
        }
        return null;
    }

    public static boolean cancelarConsulta(Integer id){
        //Muda o status para cancelada
            AgendamentoDao agendamentoController = new AgendamentoDao();
            agendamentoController.salvarStatus(id,2);
            return true; //Tela: Deu bom
    }

    public static boolean concluirConsulta(Integer id){
            AgendamentoDao agendamentoController = new AgendamentoDao();
            agendamentoController.salvarStatus(id, 3);
            return true;
    }

    public static void registrarConsulta(Date data, String observacoes, Double valor, File anexos, Integer status, int h, int m) throws Exception { //De fato salva no banco
        //Salvar na tabela a consulta agendada (concluida ou não, cancelada ou não), informando os nomes dos envolvidos.
        // Toda consulta precisa ser registrada.
        //Deve ter um status de AGENDADO, CONCLUIDO ou CANCELADA.
        Agendamento agendamento = new Agendamento();

        agendamento.setData(data);
        agendamento.setObservacao(observacoes);
        agendamento.setValor(valor);
        //agendamento.setAnexos(anexos);
        agendamento.setStatus(status);
        agendamento.setHorario(LocalTime.of(h, m));


        AgendamentoDao agendamentoController = new AgendamentoDao();
        agendamentoController.salvar(agendamento); //Salva
        System.err.print("\nSalvo com sucesso");
    }

    public static boolean isValid(String value) {  //Funçãozinha pro if() ficar melhor
        return value != null && !value.isEmpty();
    }
}