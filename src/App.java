import java.net.CacheRequest;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import edu.lista.*;
import edu.lista.carrinhodecompras.CarrinhoDeCompras;
import edu.lista.catalogosdelivros.CatalogoLivros;
import edu.lista.catalogosdelivros.Livro;
import edu.lista.listadetarefas.ListaTarefas;
import edu.lista.ordenacaodepessoas.OrdenacaoPessoas;
import edu.lista.somadenumeros.SomaNumeros;

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

        System.out.println("****************************************");

        //Criei duas novas classes, App2 e App3 para relembrar questão da hierarquia de classes.:
        /*
         * App3 extends App2, ou seja, App3 herda as caraterísticas de App2.
         * 
         * Será que eu posso definiar um novo objeto App3 inicilizando com um new App2?
         *  R: NÃO
         *  NÃO É POSSÍVEL CRIAR UMA CLASSE ESPECÍFICA INICIALIZANDO A MESMA COM UMA CLASSE MAIS GENÉRICA.
         *  NO ENTANTO, UMA CLASSE MAIS GENERICA, PODE INICIALIZAR UMA CLASSE MAIS ESPECÍFICA.
         */

        // App3 novoApp3 = new App2(); //ERRO;

        App2 novoApp3 = new App3("Novo App Três"); //NÃO-ERRO: App2 está mais acima na hierarquia, por isso é possível inicializá-la com construtor de App3
        
        //System.out.println(novoApp3.getNomeApp3()); //ERRO
        /*  OBSERVAÇÃO: COMO EU CRIEI UM OBJETO App2, e o inicializei com App3, o método getNomeApp().
            ESPECÍFICO DE APP3, NÃO ESTARÁ DISPONÍVEL.
        */

        novoApp3.setNomeApp2("Novo App Três -- Modificado");

        System.out.println(novoApp3.getNomeApp2());

        /*
         * SÓ SERÁ POSSÍVEL IMPRIMIR O NOME, NO CASO, SE HOUVER UM MÉTODO GET NAME NA CLASSE MAIS ACIMA.
         */
        
        System.out.println("****************************************");

        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Titulo livro 1", "Autor livro 1", 2001);
        catalogoLivros.adicionarLivro("Titulo livro 2", "Autor livro 1", 2002);
        catalogoLivros.adicionarLivro("Titulo livro 3", "Autor livro 1", 2003);
        catalogoLivros.adicionarLivro("Titulo livro 3", "Autor livro 2", 2004);
        catalogoLivros.adicionarLivro("Titulo livro 5", "Autor livro 2", 2005);
        catalogoLivros.adicionarLivro("Titulo livro 6", "Autor livro 3", 2006);

        System.out.println(catalogoLivros.pesquisarPorAutor("autor livro 2"));

        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2002, 2005));

        System.out.println(catalogoLivros.pesquisarPorTitulo("titulo livro 3"));

        System.out.println("****************************************");

        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(15);
        somaNumeros.adicionarNumero(91);
        somaNumeros.adicionarNumero(25);
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(75);
        somaNumeros.adicionarNumero(50);

        System.out.println("A lista de números é: " + somaNumeros.exibirNumeros());

        System.out.println("A soma dos números na lista é igual a: " + somaNumeros.calcularSoma());

        System.out.println("O maior número é: " + somaNumeros.encontrarMaiorNumero());

        System.out.println("O menor número é: " + somaNumeros.encontrarMenorNumero());

        System.out.println("****************************************");

        OrdenacaoPessoas ordernacaoPessoas = new OrdenacaoPessoas();

        
        ordernacaoPessoas.adicionarPessoa("Jonn", 39, 1.79);
        ordernacaoPessoas.adicionarPessoa("Gustavo", 29, 1.76);
        ordernacaoPessoas.adicionarPessoa("Leo", 43, 1.69);

        System.out.println("As pessoas na lista são: " + ordernacaoPessoas.exibirNomeDasPessoas());

        ordernacaoPessoas.ordenarPorIdade();

        System.out.println("As pessoas na lista (após ordenação por idade) são: " + ordernacaoPessoas.exibirNomeDasPessoas());

        ordernacaoPessoas.ordenarPorAltura();

        System.out.println("As pessoas na lista (após ordenação por altura) são: " + ordernacaoPessoas.exibirNomeDasPessoas());

    }
}