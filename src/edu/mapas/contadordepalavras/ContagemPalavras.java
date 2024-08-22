package edu.mapas.contadordepalavras;

import java.util.Map;
import java.util.HashMap;

public class ContagemPalavras {
    //atributos
    private Map<String,Integer> contagemPalavrasMap;

    //construtor
    public ContagemPalavras(){
        contagemPalavrasMap = new HashMap<String, Integer>();
    }

    public void adicionarPalavra(String palavra, int contagem) {
        contagemPalavrasMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        if(!contagemPalavrasMap.isEmpty() && contagemPalavrasMap.containsKey(palavra)){
            contagemPalavrasMap.remove(palavra);
        }
    }

    public Map<String, Integer> exibirContagemPalavras() {
        return contagemPalavrasMap;
    }

    public String encontrarPalavraMaisFrequente() {
        String palavraMaisFrequente = null;
        int numeroDePalavras = Integer.MIN_VALUE;
        //KeySet() é um método que retorna uma collection (Set) que permite iteração
        //Os Keys deste mapa são do tipo String
        for (String palavra : contagemPalavrasMap.keySet()) {
            if (contagemPalavrasMap.get(palavra) > numeroDePalavras) {
                numeroDePalavras = contagemPalavrasMap.get(palavra);
                palavraMaisFrequente = palavra;
            }
        }
        return palavraMaisFrequente;
    }

}
