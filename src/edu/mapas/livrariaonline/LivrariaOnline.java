package edu.mapas.livrariaonline;

import java.util.Map;
import java.util.SortedMap;
import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.List;

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

    public Map<String,Livro> exibirLivrosOrdenadosPorPreco() {
        /*  Com o Comparator criado na Classe do Objeto-Valor, agora é precisa trabalhar ele
         *  na Classe em que o Mapa está implementado, aplicando o entrySet (que retorna uma Collection).
         */
        /*  Para implemenar Comparador no Map é preciso usar de um artificio que converterá o entrySet(),
         *  em uma Lista para depois aplicarmos o Collections.sort;
         */

        /*  Primeiramente criamos um List com o objeto entrySet(): Map.Entry<Key, Value> */
        List<Map.Entry<String, Livro>> livrariaOnlinePorPreco;
        /*  Em seguida iniciamos essa variável com um ArrayList passando o entrySet() do map como argumento
         *  o método ArrayList aceita uma collection como argumento:
         */
        livrariaOnlinePorPreco = new ArrayList<Map.Entry<String, Livro>>(livrariaOnline.entrySet());
        /* Com a Lista devidamente decladara e iniciada, com os eleemtnos do mapa via entrySet(), basta aplicar
         * o Collections.sort sobre a lista, usando o comparador criado dentro da classe livro
         * É IMPORTANTE RESSALTAR QUE ESSE COMPARADOR É DO TIPO MAP.ENTRY<STRING, LIVRO>, QUE É A SOLUÇÃO PARA
         * ASSOCIAR A CHAVE-VALOR DE UM MAP.
         */
        Collections.sort(livrariaOnlinePorPreco, new ComparatorPorPreco());

        /* Após a ordenação da lista, é preciso montar o mapa novmanete e para isso, usa-se o LinkedHashMap()
         * e usa-se o método put para ir adicionando os elementos no map. LinkedHashMap() mantém a ordem dos
         * elementos ao criar o map, diferentemete do HashMap(), que não se preocupa com isso.
        */

        Map<String, Livro> livrariaOnlinePorPrecoMap = new LinkedHashMap<>();

        for (Map.Entry<String,Livro> entry : livrariaOnlinePorPreco) {
            livrariaOnlinePorPrecoMap.put(entry.getKey(), entry.getValue());
        }

        return livrariaOnlinePorPrecoMap;
    }

    public List<String> pesquisarLivrosPorAutor(String autor) {
        //criando a vairável List<Livro> que irá receber a lista de livros por autor;
        List<String> livrosPorAurtor = new ArrayList<String>();
        /*  Para poder varrer os elementos do map, vou preisar usar o entrySet() */
        List<Map.Entry<String, Livro>> livroEntryList = new ArrayList<>(livrariaOnline.entrySet());

        for (Map.Entry<String,Livro> entry : livroEntryList) {
            if(entry.getValue().getAutor().equals(autor)) {
                livrosPorAurtor.add(entry.getValue().getTitulo());
            }
        }
        return livrosPorAurtor;
    }   

    public List<String> obterLivrosMaisCaro() {
        double maiorPreco = Double.MIN_VALUE;
        List<Livro> livrosMaisCaros = new ArrayList<Livro>();
        List<String> livrosMaisCarosTitulo = new ArrayList<String>();
        Livro livroMaisCaro = null;
        
        for (Livro livro : livrariaOnline.values()) {
            livrosMaisCaros.add(livro);
        }

        Collections.sort(livrosMaisCaros, new ComparatorPorPrecoLista());

        for (Livro livro : livrosMaisCaros) {
            livrosMaisCarosTitulo.add(livro.getTitulo());
        }

        return livrosMaisCarosTitulo;   
    }
}
