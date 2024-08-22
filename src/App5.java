import edu.mapas.dicionario.Dicionario;
import edu.mapas.estoquedeprodutos.EstoqueProdutos;

public class App5 {
    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();
        
        dicionario.adicionarPalavra("Casa", "Moradia de uma pessoa");
        dicionario.adicionarPalavra("Computador", "Uma máquina que executa cálculos matemáticos");
        dicionario.adicionarPalavra("Palavra 1", "Definição 1");
        dicionario.adicionarPalavra("Palavra 2", "Definição 2");
        dicionario.adicionarPalavra("P3", "D3");
        dicionario.adicionarPalavra("Palavra 1", "Definição 1 (atualização)");
        dicionario.adicionarPalavra("Casa", "Moradia de uma família");

        System.out.println(dicionario.eixibirPalavras());

        dicionario.removerPalavra("Computador");

        System.out.println(dicionario.pesquisarPorPalavra("Computador"));

        System.out.println(dicionario.eixibirPalavras());
        
        System.out.println("******************************************************");

        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.adicionarProduto(123, "P1", 10, 168.45);
        estoqueProdutos.adicionarProduto(456, "P2", 12, 8527.55);
        estoqueProdutos.adicionarProduto(789, "P3", 4, 1648.45);
        estoqueProdutos.adicionarProduto(758, "P4", 60, 8457.55);
        estoqueProdutos.adicionarProduto(159, "P5", 8, 1628.45);
        estoqueProdutos.adicionarProduto(987, "P6", 33, 8657.55);
        estoqueProdutos.adicionarProduto(654, "P7", 11, 168.25);
        estoqueProdutos.adicionarProduto(321, "P8", 1, 85447.55);

        System.out.println(estoqueProdutos.calcularValorTotalEstoque());
        System.out.println(estoqueProdutos.exibirProdutos());
        System.out.println(estoqueProdutos.obterProdutoMaisCaro());
        System.out.println(estoqueProdutos.obterProdutoMaisBarato());
        System.out.println("--");
        System.out.println(estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());


    }
}