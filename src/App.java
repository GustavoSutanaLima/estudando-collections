import java.net.CacheRequest;
import java.util.ArrayList;
import java.util.List;
import edu.lista.*;
import edu.lista.carrinhodecompras.CarrinhoDeCompras;
import edu.lista.listadetarefas.ListaTarefas;

public class App {
    public static void main(String[] args) {
        ListaTarefas novaListaDeTarefas = new ListaTarefas();

        novaListaDeTarefas.adicionarTarefa("Limpar o quarto");
        novaListaDeTarefas.adicionarTarefa("Limpar a Cozinha");
        novaListaDeTarefas.adicionarTarefa("Tratar do Cachorro.");

        novaListaDeTarefas.obterDescricoesTarefas();

        novaListaDeTarefas.removerTarefa("Limpar a Cozinha");

        System.out.println("----------");

        novaListaDeTarefas.obterDescricoesTarefas();

        System.out.println("O numero total de tarefas é: " + novaListaDeTarefas.obterNumeroTotalDeTarefas());;


        System.out.println("****************************************");

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Teclado Mancer", 113.45, 2);
        carrinho.adicionarItem("Cera Pico Expert", 33.90, 3);
        carrinho.adicionarItem("Smartphone Poco F6", 2399.87, 1);

        System.out.println("O valor total deste carrinho é: " + carrinho.calcularValorTotal());

        carrinho.exibirItens();


    }
}