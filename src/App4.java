import edu.conjuntos.cadastrodeprodutos.CadastroProdutos;
import edu.conjuntos.listadealunos.Aluno;
import edu.conjuntos.listadealunos.GerenciadorAlunos;
import edu.conjuntos.listadetarefas.ListaTarefas;

public class App4 {
    public static void main(String[] args) {
        
        ListaTarefas novaListaDeTarefas = new ListaTarefas();

        
        novaListaDeTarefas.adicionarTarefa("Lavar o carro");
        novaListaDeTarefas.adicionarTarefa("Construir casa do cachorro");
        novaListaDeTarefas.adicionarTarefa("Lavar a bike");

        novaListaDeTarefas.exibirTarefas();

        novaListaDeTarefas.contarTarefas();

        novaListaDeTarefas.marcarTarefaConcluida("Lavar o carro");

        novaListaDeTarefas.exibirTarefas();

        novaListaDeTarefas.limparListaTarefas();
        System.out.println("---");
        novaListaDeTarefas.exibirTarefas();
        novaListaDeTarefas.contarTarefas ();


        System.out.println("***********************************************");

        CadastroProdutos cadPro = new CadastroProdutos();

        cadPro.adicionarProduto(1, "Celular", 2123.45, 3);
        cadPro.adicionarProduto(2, "Computador", 5500.45, 1);
        cadPro.adicionarProduto(4, "Aparelho de barbear", 190.25, 2);
        cadPro.adicionarProduto(3, "Bicicleta", 20799.90, 2);
        cadPro.adicionarProduto(5, "Balança de precisão",  89.45, 1);
        
        cadPro.exibirProdutosPorNome();
        System.out.println("---");
        cadPro.exibirProdutosPorPreco();

        System.out.println("***********************************************");

        GerenciadorAlunos alunos = new GerenciadorAlunos();

        alunos.adicionarAluno("Gustavo", 123L, 81);
        alunos.adicionarAluno("Jonn", 456L, 79);
        alunos.adicionarAluno("Alexandre", 888l, 67);
        alunos.adicionarAluno("Leo", 789L, 72);
        alunos.adicionarAluno("André", 556L, 84);
        alunos.adicionarAluno("Lucas", 159L, 92);
        alunos.adicionarAluno("Guilherme", 753L, 88);
        alunos.adicionarAluno("Gabriel", 125L, 77);

        System.out.println(alunos.exibirAlunosPorNome());

        System.out.println(alunos.exibirAlunosPorNota());


    }
}
