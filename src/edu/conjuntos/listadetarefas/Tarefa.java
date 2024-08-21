package edu.conjuntos.listadetarefas;

public class Tarefa {
    private String descricao;
    private boolean status = false;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Tarefa [descricao=" + descricao + ", status=" + status + "]";
    }

    

}
