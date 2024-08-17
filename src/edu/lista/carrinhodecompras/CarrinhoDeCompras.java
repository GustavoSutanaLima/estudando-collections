package edu.lista.carrinhodecompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    
    //Atributo da Classe Carrinho de Compras é uma lista cujos objetos são da classe Item;
    private List<Item> itensDoCarrinho;


    //Construtor da Classe Carrinho de Compras: toda vez que um objeto do tipo CarrinhoDeCompras for instanciado, um novo ArrayList de objetos do tipo Item será instanciado

    public CarrinhoDeCompras(){
        this.itensDoCarrinho = new ArrayList<Item>();
    }

    public void adicionarItem(String nomeDoItem, double precoDoItem, int quantidadeDoItem) {
        Item novoItem = new Item(nomeDoItem, precoDoItem, quantidadeDoItem);
        itensDoCarrinho.add(novoItem);
    }

    public void removerItem(String nomeDoItem) {

        //Lista de itens a remover:
        List<Item> itensARemover = new ArrayList<Item>();

        //for each: para cada item (objeto do tipo Item) no meu ArrayList de Item:
        for (Item item : itensDoCarrinho) {
            //se o nome do item é igual (ignorando o case - caixa alta ou não) ao nomeDoItem (String)
            //vou adcionar o objeto do tipo Item que tem esse nomeDoItem como atribudo de nome a minha
            //lista de itens a remover;
            if(item.getNomeDoItem().equalsIgnoreCase(nomeDoItem)) {
                itensARemover.add(item);
            }
        }
        //Remove todos os itens do carrinho que estão na Collection itensARemover (uma lista implementa coleções) 
        itensDoCarrinho.removeAll(itensARemover);
    }

    public double calcularValorTotal() {
        double varAuxCalculoValorTotal = 0;
        for (Item item : itensDoCarrinho) {
            varAuxCalculoValorTotal+= (item.getQuantidadeDoItem()*item.getPrecoDoItem());
        }
        return varAuxCalculoValorTotal;
    }

    public void exibirItens() {
        //quero exibir uma lista de itens e que cada atributo de Item esteja em uma lista
        List<String> nomeDoItem = new ArrayList<>();
        List<Double> precoDoItem = new ArrayList<>();
        List<Integer> quantidadeDoItem = new ArrayList<>();

        for (Item item: itensDoCarrinho) {
            nomeDoItem.add(item.getNomeDoItem());
            precoDoItem.add(item.getPrecoDoItem());
            quantidadeDoItem.add(item.getQuantidadeDoItem());
        }

        System.out.println("Nome do Item -- Preco do Item -- Quantidade do Item");
        for (int i = 0; i < itensDoCarrinho.size(); i++) {
            System.out.println(nomeDoItem.get(i) + " -- " + precoDoItem.get(i).doubleValue() + " -- " + quantidadeDoItem.get(i).intValue());
            
        }
    }


}
