package edu.lista.somadenumeros;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class SomaNumeros {
    
    private List<Integer> listaNumeros;

    public SomaNumeros() {
        listaNumeros = new ArrayList<Integer>();
    }

    public void adicionarNumero(int numero) {
        //Usando cast para "converter", melhor dizendo, tratar a variável int como se fosse um objeto da Classe Integer.
        Integer numeroObjeto = (Integer) numero; 
        listaNumeros.add(numeroObjeto);
    }

    public int calcularSoma() {

        int totalElementosLista = 0;

        for (Integer integer : listaNumeros) {
            totalElementosLista+=integer.intValue();
        }

        return totalElementosLista;
    }

    public int encontrarMaiorNumero() {
        /*
         * Collections é uma classe que possue um método estático sort que organiza os elementos de uma lista;
         * Collections.sort(Object o) --> Classifica em ordem crescente;
         * Collections.sort(Object o, Comparator<T>) --> Classifica os objetos de uma lista de acordo com um comparador de
         * de um tipo específico.
         * 
         * O Collections.sort abaixo classifica a listaNumeros de acordo com o comparador comparadorMaiorNumero, declarado abaixo.
         */
        Collections.sort(listaNumeros, comparadorMaiorNumero);
        //System.out.println("DO MAIOR PARA O MENOR: "+listaNumeros);
        return listaNumeros.get(0);
    }
    /*
     * Compartor<T> é uma interface que possui em seu corpo o método compare. 
     * Para utilizá-lo é OBRIGATORIO que seu método intrínseco seja implementado,
     * veja:
     *  
     *      private Comparador<T> nomeComparador = new Comparador<T>() {
     *              public int compare (Object o1, Object o2) {
     *                      //To do here;;
     *                  }
     *          };
     * 
     */
    private Comparator<Integer> comparadorMaiorNumero = new Comparator<Integer>() {
        public int compare(Integer o1, Integer o2) {
            if (o1.intValue() < o2.intValue()) {
                return 0;
            }
            else {
                return -1;
            }
        };
    };

    public int encontrarMenorNumero() {
        Collections.sort(listaNumeros, comparadorMenorNumero);
        //System.out.println("DO MENOR PRO MAIOR: " + listaNumeros);
        return listaNumeros.get(0);
    }

    private Comparator<Integer> comparadorMenorNumero = new Comparator<Integer>() {
        public int compare(Integer o1, Integer o2) {
            if (o1.intValue() < o2.intValue()) {
                return -1;
            }
            else {
                return 0;
            }
        };
    };

    public List<Integer> exibirNumeros () {
        return listaNumeros;
    }


}
