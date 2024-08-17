package edu.lista.listadetarefas;

public class Tarefa {

    private String descricaoTarefa;

    //Método Construtor de uma nova Tarefa.
    public Tarefa (String descricaoTarefa) {
        this.descricaoTarefa = descricaoTarefa;
    }


    //Método getter para retornar o nome da tarefa;
    public String getNomeTarefa () {
        return this.descricaoTarefa;
    }

  

}
