package edu.mapas.estoquedeprodutos;

import java.util.Map;
import java.util.HashMap;

public class EstoqueProdutos {
    //artibutos
    private Map<Integer, Produto> produtosMap;

    //construtor
    public EstoqueProdutos(){
        produtosMap = new HashMap<Integer, Produto>();
    }

    public void adicionarProduto(int cod, String nome, int quantidade, double preco) {
        produtosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public Map<Integer, Produto> exibirProdutos() {
        return produtosMap;
    }

    public double calcularValorTotalEstoque() {
        double valorTotal = 0;
        if(produtosMap.isEmpty()){
            return valorTotal;
        }
        else {
            /*
             * preciso iterar sobre valores desse mapa, que são objetos do tipo Produto.
             * Porém, não é possível iterar um Map. No entanto, na Classe Map, exister um método
             * valores que retornar uma coleção com os valores desse Map (nesse caso, uma coleção - List, Set - de Produtos);
             * O valor de cada um dos objetos produto está lá dentro e além deles a quantidade de cada produto, 
             * por isso precisamos iterar por eles, ou seja, os objetos do tipo Produto.
             * 
             * Map.values() -> retorna uma lista de objetos referentes aos valores daquele mapa.
             */
            for (Produto produto : produtosMap.values()) {
                valorTotal += (produto.getValor() + produto.getQuantidade());
            }
            return valorTotal;
        }
    }
    
    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        if(produtosMap.isEmpty()) {
            return produtoMaisCaro;
        }
        else{
            /*  Para descobrir o produto mais caro, vou precisar iterar sobre os valores do mapa
             *  que são objetos do tipo Produto;
             *  A questão agora é? Como descobrir o valor mais caro de uma lista de objetos?*/
             
             /* Crio uma variável do mesmo tipo do valore que quero comprar, com o menor valore
             *  possível que esse tipo de variável pode assumir.
             */
            double valorProdutoMaisCaro = Double.MIN_VALUE;
            for (Produto produto : produtosMap.values()) {
                if(produto.getValor() > valorProdutoMaisCaro) {
                    valorProdutoMaisCaro = produto.getValor();
                    produtoMaisCaro = produto;
                }
            }
            return produtoMaisCaro;
        }
       
    }

    //É biscamente a lógica contrária a do método acima;
    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        if(produtosMap.isEmpty()){
            return produtoMaisBarato;
        }
        else{
            //variável auxiliar para verificarção de melhor valor de Produto;
            double menorValor = Double.MAX_VALUE;
            for (Produto produto : produtosMap.values()) {
                if(produto.getValor() < menorValor) {
                    menorValor = produto.getValor();
                    produtoMaisBarato = produto;
                }
            }
            return produtoMaisBarato;
        }
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        Produto produtoQuantidadeValor = null;
        if(produtosMap.isEmpty()){
            return produtoQuantidadeValor;
        }
        else{
            double quantidadeValor = Double.MIN_NORMAL;
            for (Produto produto : produtosMap.values()) {
                if(produto.getQuantidade()*produto.getValor() > quantidadeValor) {
                    quantidadeValor = produto.getQuantidade()*produto.getValor();
                    produtoQuantidadeValor = produto;
                }
            }
            return produtoQuantidadeValor;
        }
    }
}
