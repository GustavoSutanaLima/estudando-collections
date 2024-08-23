import edu.conjuntos.conjuntodeconvidados.ConjuntoConvidados;
import edu.mapas.contadordepalavras.ContagemPalavras;
import edu.mapas.dicionario.Dicionario;
import edu.mapas.estoquedeprodutos.EstoqueProdutos;
import edu.mapas.livrariaonline.LivrariaOnline;

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

        System.out.println("******************************************************");

        ContagemPalavras countWords = new ContagemPalavras();

        countWords.adicionarPalavra("Palavra 1", 123);
        countWords.adicionarPalavra("Palavra 2", 456);
        countWords.adicionarPalavra("Palavra 3", 79);

        System.out.println(countWords.exibirContagemPalavras());

        countWords.removerPalavra("Palavra 2");

        
        System.out.println(countWords.exibirContagemPalavras());

        System.out.println(countWords.encontrarPalavraMaisFrequente());

        
        System.out.println("******************************************************");

        LivrariaOnline onlineBookStore = new LivrariaOnline();

<<<<<<< HEAD
        onlineBookStore.adicionarLivro("https://www.amazon.com.br/Como-fazer-amigos-influenciar-pessoas/dp/8543108683", "Como fazer amigos e influenciar pessoas", "Dale Carnegie", 100.90);
        onlineBookStore.adicionarLivro("https://www.amazon.com.br/Orgulho-Preconceito-Acompanha-marcador-p%C3%A1ginas/dp/6584956229", "Orgulho e Preconceito - Edição de Luxo Almofadada", "Jane Austen", 120.90);
        onlineBookStore.adicionarLivro("https://www.amazon.com.br/Apostando-no-amor-Lynn-Painter/dp/8551009737", "Apostando no amor", "Lynn Painter", 140.90);
        onlineBookStore.adicionarLivro("https://www.amazon.com.br/Como-fazer-amigos-influenciar-pessoas/dp/108683", "Rápido e devagar", "Dale Carnegie", 160.90);
        onlineBookStore.adicionarLivro("https://www.amazon.com.br/Orgulho-Preconceito-Acompanha-marcador-p%C3%A1ginas/dp/84956229", "Orgulho e Preconceito - Edição básica", "Jane Austen", 180.90);
        onlineBookStore.adicionarLivro("https://www.amazon.com.br/Apostando-no-amor-Lynn-Painter/dp/1009737", "Apostando no amor: o amor não acabou", "Lynn Painter", 200.90);

        System.out.println("--");
        System.out.println(onlineBookStore.exibirLivros());
        System.out.println("--");
        System.out.println(onlineBookStore.exibirLivrosOrdenadosPorPreco());
        System.out.println(onlineBookStore.pesquisarLivrosPorAutor("Dale Carnegie"));
        System.out.println(onlineBookStore.obterLivrosMaisCaro());
=======
        onlineBookStore.adicionarLivro("https://www.amazon.com.br/Como-fazer-amigos-influenciar-pessoas/dp/8543108683", "Como fazer amigos e influenciar pessoas", "Dale Carnegie", 39.90);
        onlineBookStore.adicionarLivro("https://www.amazon.com.br/Orgulho-Preconceito-Acompanha-marcador-p%C3%A1ginas/dp/6584956229", "Orgulho e Preconceito - Edição de Luxo Almofadada", "Jane Austen", 24.57);
        onlineBookStore.adicionarLivro("https://www.amazon.com.br/Apostando-no-amor-Lynn-Painter/dp/8551009737", "Apostando no amor", "Lynn Painter", 7.42);
    
       
        System.out.println("--");
        System.out.println(onlineBookStore.exibirLivros());

        System.out.println("--");
        onlineBookStore.exibirLivrosOrdenadosPorPreco();
>>>>>>> 910850e876e9c991ecc40195a29dbfa660da6b4e
    }
}