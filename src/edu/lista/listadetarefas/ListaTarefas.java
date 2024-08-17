package edu.lista.listadetarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    
    private List<Tarefa> listaDeTarefas;

    //Construtor de ListaTarefas

    public ListaTarefas() {
        this.listaDeTarefas = new ArrayList<Tarefa>();
    }

    public void adicionarTarefa(String descricaoTarefa) {
        listaDeTarefas.add(new Tarefa(descricaoTarefa));
    }

    public void removerTarefa(String descricaoTarefa) {
        for (Tarefa tarefa : listaDeTarefas) {
            if (tarefa.getNomeTarefa().equalsIgnoreCase(descricaoTarefa)) {
                listaDeTarefas.remove(tarefa);
            }
        }
    }

    public int obterNumeroTotalDeTarefas() {
        return listaDeTarefas.size();
    }

    public void obterDescricoesTarefas() {
        List<String> descricaoTarefa = new ArrayList<String>();
        for (Tarefa tarefa : listaDeTarefas) {
            descricaoTarefa.add(tarefa.getNomeTarefa());
        }
        System.out.println(descricaoTarefa);
    }

}
