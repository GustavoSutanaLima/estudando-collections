package edu.mapas.livrariaonline;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

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

<<<<<<< HEAD
/* Quando a Classe está sendo usada em um Map e precisamos organizar os elementos por um determinado atributo 
 * do Objeto de valor desse map, é preciso usar um entrySet(), pois só assim é possível associar as chaves aos valores.
 * Map.Entry<K,V>
 */
class ComparatorPorPreco implements Comparator<Map.Entry<String, Livro>> {
    @Override
    public int compare(Entry<String, Livro> o1, Entry<String, Livro> o2) {
        return Double.compare(o2.getValue().getPreco(),o1.getValue().getPreco());
    }
}
class ComparatorPorPrecoLista implements Comparator<Livro> {
    @Override
    public int compare(Livro o1, Livro o2) {
        return Double.compare(o2.getPreco(), o1.getPreco());
    }
=======
class ComparatorPorPreco implements Comparator<Map.Entry<String, Livro>> {
   @Override
   public int compare(Entry<String, Livro> o1, Entry<String, Livro> o2) {
       return Double.compare(o1.getValue().getPreco(), o2.getValue().getPreco());
   }
>>>>>>> 910850e876e9c991ecc40195a29dbfa660da6b4e
}