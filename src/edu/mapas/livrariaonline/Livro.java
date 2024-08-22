package edu.mapas.livrariaonline;

import java.util.Comparator;

public class Livro {
    //Atributos
    private String titulo;
    private String autor;
    private double preco;
    
    //construtor
    public Livro(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }
    
    //Métodos getters()
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getPreco() {
        return preco;
    }

    //toString() para melhor exibição do objeto
    @Override
    public String toString() {
        return "Livro [titulo=" + titulo + ", autor=" + autor + ", preco=" + preco + "]";
    }

}

class ComparatorPorPreco implements Comparator<Livro> {
    @Override
    public int compare(Livro livro1, Livro livro2) {
        return Double.compare(livro1.getPreco(), livro2.getPreco());
    }
}