import edu.mapas.dicionario.Dicionario;

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
        

    }
}