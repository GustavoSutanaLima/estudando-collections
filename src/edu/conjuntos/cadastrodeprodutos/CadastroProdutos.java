package edu.conjuntos.cadastrodeprodutos;

import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CadastroProdutos {

    private Set<Produto> setProdutos;

    public CadastroProdutos() {
        this.setProdutos = new HashSet<Produto>();
    }

    public void adicionarProduto(int codigo, String nome, double preco, int quantidade) {
        setProdutos.add(new Produto(nome, codigo, preco, quantidade));
    }

    public void exibirProdutosPorNome(){
        List<Produto> listaDeProdutos = setToListProduto(setProdutos);
        Collections.sort(listaDeProdutos);
        for (Produto produto : listaDeProdutos) {
            System.out.println(produto.getNome() + " - " + produto.getPreco());
        }
    }

    private List<Produto> setToListProduto (Set<Produto> setProdutos) {
        List<Produto> listProdutos = new ArrayList<Produto>();
        for (Produto produto : setProdutos) {
            listProdutos.add(produto);
        }
        return listProdutos;
    }

    public void exibirProdutosPorPreco() {
        List<Produto> listaDeProdutos = setToListProduto(setProdutos);
        Collections.sort(listaDeProdutos, comparadorPreco);
        for (Produto produto : listaDeProdutos) {
            System.out.println(produto.getNome() + " - " + produto.getPreco());
        }
    }

    Comparator<Produto> comparadorPreco = new Comparator<Produto>() {
        @Override
        public int compare(Produto o1, Produto o2) {
            if(o1.getPreco() < o2.getPreco()) {
                return -1;
            }
            return 0;
        }
    };
}
