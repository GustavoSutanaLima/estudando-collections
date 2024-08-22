package edu.mapas.livrariaonline;

import java.util.Map;
import java.util.SortedMap;
import java.util.HashMap;
import java.util.TreeMap;

public class LivrariaOnline {
    //Atributo
    private Map<String, Livro> livrariaOnline;

    //Construtor
    public LivrariaOnline () {
        livrariaOnline = new HashMap<String, Livro>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco) {
        livrariaOnline.put(link, new Livro(titulo, autor, preco));
    }

    public Map<String, Livro> exibirLivros() {
        return livrariaOnline;
    }

    public void removerLivro(String titulo) {
        if(!livrariaOnline.isEmpty()) {
            /*
             * O método entrySet() retorna um Set apontando a chave específica ao valor dessa chave (em um único elemento)
             * A partir dele é possível extrair o valor e a chave correspondente;
             */
            var entryLivrariaOnline = livrariaOnline.entrySet();
            for (var entry : entryLivrariaOnline) {
                if(entry.getValue().getTitulo().equals(titulo)){
                    livrariaOnline.remove(entry.getKey());
                    break;
                }
            }
        }
    }

    public void exibirLivrosOrdenadosPorPreco() {
        //Cria um novo TreeMap (ideia parecida com TreeSet)
        var entryLivrariaOnlineOrganizada = livrariaOnline.entrySet();
    }
}
