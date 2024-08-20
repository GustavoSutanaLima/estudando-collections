package edu.lista.ordenacaonumeros;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class OrdenacaoNumeros {
    //Atributos:
    private List<Integer> listaDeNumeros;

    //Construtor:
    public OrdenacaoNumeros() {
        listaDeNumeros = new ArrayList<Integer>();
    }
    
    //Adiciona um número à lista.
    public void adicionarNumero(int numero) {
        listaDeNumeros.add((Integer) numero);
    }

    //Exibir lista de numeros
    public List<Integer> retonarListaNumeros() {
        return listaDeNumeros;
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> listaVazia = new ArrayList<Integer>();
        try {
            Collections.sort(listaDeNumeros);
            return listaDeNumeros;
        } catch (Exception e) {
            System.out.println("Lista de Numeros está vazia");
            return listaVazia;
        }
    }
    
    public List<Integer> ordenarDescendente() {
        List<Integer> listaVazia = new ArrayList<Integer>();
        try {
            listaDeNumeros = ordenarAscendente();
            Collections.reverse(listaDeNumeros);;
            return listaDeNumeros;
        } catch (Exception e) {
            System.out.println("Lista de números está vazia");
            return listaVazia;
        }
    }

}
