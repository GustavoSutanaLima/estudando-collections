package edu.conjuntos.listadealunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    //Atributo
    private Set<Aluno> alunosSet;

    //Construtor
    public GerenciadorAlunos(){
        //cria um novo Set de alunos (HashSet armazenda os objetos do tipo Aluno em uma ordem aleatória)
        alunosSet = new HashSet<Aluno>();
    }

    public void adicionarAluno(String nome, Long matricula, double media) {
        //Cria um novo (new) objeto do tipo Aluno e o adiciona ao set de alunos
        alunosSet.add(new Aluno(nome, matricula, media));
    }

    //Retorna um conjunto de alunos por nome (em ordem alfabética);
    public Set<Aluno> exibirAlunosPorNome() {
        /*
         * Neste caso, NÃO podemos usar o método HashSet() para criar um novo set, pois esse
         * esse método NÃO SE PREOCUPA com a ordem dos elementos. Porém, existe um outro método que
         * implementa a Collections Set de maneira organizada, chamado TreeSet().
         */

        /*
         * Instancia um novo TreeSet() de objetos do tipo Aluno com base em um Set Pre-existente de nome alunoSet
         * TreeSet() também pode ser iniciado com base em uma outra collections.
         * 
         * Mas somente instanciar este método, não é o suficiente para organizar os Alunos em ordem alfabetica,
         * é preciso definir uma ordem natural para que isso aconteça, a ordem que o TreeSet respeitará
         * para organizar os objetos nesse conjunto. Para isso usamos a interface Comparable (veja sua implementação
         * na classe Aluno).
         */
        Set<Aluno> setAlunosPorNome = new TreeSet<Aluno>(alunosSet);
        return setAlunosPorNome;
    }
    //Retorna um conjunto de alunos por nota()
    public Set<Aluno> exibirAlunosPorNota() {
        /*
         * No método acima, definimos uma ordem natural para o TreeSet implementando o Comparable na classe
         * alunos. Agora, para criamos uma nova ordem, neste caso, de acordo com a ordem iremos usar implementar
         * a interface Comparator. Essa classe NÃO PODE implementar a classe principal (Aluno, no caso), 
         * é preciso criar uma nova classe. Mas daí como esse Comparator sabe que precisa comparar objetos
         * da classe Aluno? Por causa do diamond operator (generics) que a ele precisa ser definido: Comparator<Aluno>,
         * ele exite um tipo de objeto para poder trabalhar.
         */

        /* 
         * Após definida uma nova classe Comparator<Aluno>, vamos implementá-la:
        */

        //O método TreeSet permite a criação de um conjunto ordenado (SortedSet) a partir de um Comparator
        //Então, basta inicializarmos com a Classe que acabamos de Criar.

        Set<Aluno> setAlunosPorNota = new TreeSet<Aluno>(new ComparatorPorNota());
        //IMPORTANTE: ESTE SET IRÁ ORDERNAR OS ELEMENTOS DE ACORCO COM A NOTA, ASSIM COMO DEFINIDO NO
        //COMPARADOR, MAS ELE É CRIADO VAZIO (NÃO TEM COMO O TREESET SABER OS ELEMENTOS QUE ELE VAI ACRESCENTAR),
        //MAS A ORDEM COMO ELES SERÃO ORDENADOS JÁ ESTÁ DEFINIDA PELO COMPARADOR.
        
        /*  Logo, precisamos usar o método addAll para colocarmos os elementos de nosso conjunto (hashset)
         *  nese novo conjunto (treeset) ordenado de acorcom com o comparador:
         */
        setAlunosPorNota.addAll(alunosSet);

        return setAlunosPorNota;
    }

}   
