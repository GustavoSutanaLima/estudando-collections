package edu.conjuntos.conjuntodepalavrasunicas;

import java.util.*;

public class ConjuntoPalavrasUnicas {
    //Palavras únicas (ou seja, não podem haver palavras iguais), um conjunto é basicamente uma lista
    //de itens que não se repetem. Uma outra particularide dos Sets é que dependendo de como o objeto é
    //que os itens ficam ordenados de maneira aleatória, e não na ordem em que foram inseridos no objeto.

    private Set<String> conjutoDepalavrasUnicas;

    public ConjuntoPalavrasUnicas() {
        conjutoDepalavrasUnicas = new HashSet<String>(); 
        /*  cria um novo conjunto hashset (use este quando)
            a ordem dos elementos não importar;
        */
    }

    public void adicionarPalavra(String palavra) {
        conjutoDepalavrasUnicas.add(palavra.toLowerCase());
    }

    public void removerPalavras(String palavra) {
        conjutoDepalavrasUnicas.remove(palavra.toLowerCase());
    }

    public boolean verificarPalavra(String palavra) {
        for (String palavraUnica : conjutoDepalavrasUnicas) {
            if(palavraUnica.equals(palavra.toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    public Set<String> exibirPalavrasUnicas() {
        return conjutoDepalavrasUnicas;
    }

}
