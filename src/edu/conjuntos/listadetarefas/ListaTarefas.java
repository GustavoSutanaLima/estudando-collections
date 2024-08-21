package edu.conjuntos.listadetarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> listaDeTarefas;
    
    public ListaTarefas(){
        this.listaDeTarefas = new HashSet<Tarefa>();
    }

    public void adicionarTarefa(String descricao) {
        listaDeTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        for (Tarefa tarefa : listaDeTarefas) {
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                listaDeTarefas.remove(tarefa);
            }
        }
    }

    public void exibirTarefas() {
        for (Tarefa tarefa : listaDeTarefas) {
            System.out.println(tarefa.getDescricao() + " --> " + tarefa.isStatus());
        }
    }

    public void contarTarefas() {
        System.out.println("Total de tarefas é: " + listaDeTarefas.size());
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<Tarefa>();
        for (Tarefa tarefa : listaDeTarefas) {
            if(tarefa.isStatus()) {
                tarefasConcluidas.add(tarefa);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendetes = new HashSet<Tarefa>();
        for (Tarefa tarefa : listaDeTarefas) {
            if(!tarefa.isStatus()) {
                tarefasPendetes.add(tarefa);
            }
        }
        return tarefasPendetes;
    }

    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa tarefa : listaDeTarefas) {
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefa.setStatus(true);
            }
        }   
    }

    public void marcarTarefaPendente(String descricao) {
        for (Tarefa tarefa : listaDeTarefas) {
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefa.setStatus(false);
            }
        } 
    }

    public void limparListaTarefas() {
        listaDeTarefas.removeAll(listaDeTarefas);
    }
}
