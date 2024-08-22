package edu.mapas.dicionario;

import java.util.Map;
import java.util.HashMap;

public class Dicionario {
    //atributos
    //cria um novo mapa que tem como chave um objeto do tipo String e como valor outro objeto String;
    //sintaxe: Map<K, V> ->K = Key(chave), ->V = value(valor)
    private Map<String, String> dicionarioPalavraDefinicao;

    //construtor
    public Dicionario(){
        dicionarioPalavraDefinicao = new HashMap<String, String>(); //inicializa o objeto com um HashMap;
        /*
         * IMPORTANTE: O map, por natureza, só aceita um conjunto chave-valor, ou seja, a mesma chave SÓ PODE TER UM valor.
         * Porém, podem existir chaves diferentes com mesmo valor.
         */
    }

    public void adicionarPalavra(String palavra, String definicao) {
        //O método put adiciona/atualiza uma chave-valor de um determinado elemento de um map.
        //Caso não exista essa chave no Map, o método put() adiciona o par chave-valor;
        //Caso já exista uma determinada chave no Map, o método put() ATUALIZA O VALOR da chave especificada.
        dicionarioPalavraDefinicao.put(palavra, definicao); 
    }

    public void removerPalavra(String palavra){
        //O método remove() remove o elemento do mapa, passando somente a key desse elemento,
        //Mas também é possível usar o conjunto key-value para remover o elemento;
        dicionarioPalavraDefinicao.remove(palavra);
    }

    public Map<String, String> eixibirPalavras(){
        if(!dicionarioPalavraDefinicao.isEmpty()){
            return dicionarioPalavraDefinicao;
        }
        else {
            return null;
        }
        
    }

    public String pesquisarPorPalavra(String palavra) {
        //O método get() retorna o valor de uma chave;
        if(dicionarioPalavraDefinicao.containsKey(palavra)){
            return dicionarioPalavraDefinicao.get(palavra);
        }
        return "Palavra não cadastrada.";
    }
}
