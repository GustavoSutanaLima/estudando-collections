package edu.mapas.estoquedeprodutos;

public class Produto {
    //atribuos de produto:
    private String nome;
    private double valor;
    private int quantidade;
    
    //construtor de produto:
    public Produto(String nome, double valor, int quantidade) {
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    //Métodos Getters.:
    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    //Método sobrecarregado toString() para exibição em pritns de objetos do tipo Produto:
    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", valor=" + valor + ", quantidade=" + quantidade + "]";
    }

   

    
    

    
    
}
