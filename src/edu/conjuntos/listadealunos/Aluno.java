package edu.conjuntos.listadealunos;

import java.util.Comparator;

public class Aluno implements Comparable<Aluno> {
    //Atributos
    private String nome;
    private long matricula;
    private double nota;
    
    //Construtor
    public Aluno(String nome, long matricula, double nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }

    //Getters
    public String getNome() {
        return nome;
    }

    public long getMatricula() {
        return matricula;
    }

    public double getNota() {
        return nota;
    }

    
    /*Dois alunos podem ter o mesmo nome e nota, mas não podem ter o MESMO número de matrícula.:
    os sets não permitem elementos iguais. Porém, neste caso, o objeto Aluno possui três
    atributos diferentes: nome, matrícula e nota. Para diferenciarmos de acordo com um (ou mais)
    de um deles usa-se o equals() e o hashcode() que são métods sobrecarregados (override) da classe Object;
        Com esses métodos definidos agora o set não aceitará mais elementos que tenham a mesma matrícula
    */

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (matricula ^ (matricula >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Aluno other = (Aluno) obj;
        if (matricula != other.matricula)
            return false;
        return true;
    }

    /*
     * Ao implementar a interface Comparable, é preciso, de forma obrigatória, sobreescrever o método compareTo.
     * 
     * O método compareTo é usado para compara um elemento da classe Aluno com outro (desta mesma classe)
     * quando eles estão agrupados em uma coleção. Nesse caso, compara-se o this.nome (o nome desse aluno)
     * com o nome de outro aluno (usando o método getNome()) da própria Classe.
     * 
     * Fazendo isso, implementamos uma ordem natural para Sets (criados a partir do TreeSet) que irá garantir
     * que os elementos Aluno desse Set ficarão organizados por nome (em ordem alfabética).
     * 
     * OBS: LEMBRADO QUE O COMPARABLE É IMPLMENTADO SEMPRE NA CLASSE ORIGEM DA COLEÇÃO (LIST, SET, MAP);
     */
    @Override
    public int compareTo(Aluno outroAluno) {
        return this.nome.compareTo(outroAluno.getNome());
    } 
    
    /*
    * O método sobrecarregado toString() garante que, ao printarmos um objeto desta Classe teremos
    * uma string definida para exibição, ao invés de imprimir um enderço de objeto.
    */
    
    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", matricula=" + matricula + ", nota=" + nota + "]";
    } 
}

/*
 * Criando a classe ComparatorPorNota e implementando a interface Comparator.:
 * Essa interface exige que o método sobrecarregado seja implementado, e é por ele
 * que a ordenação será feita.
 */
class ComparatorPorNota implements Comparator<Aluno> {
    @Override
    public int compare(Aluno o1, Aluno o2) {
        //getNota() retorar um double, esse elemento pertence a classe Wraper Double.
        //dentor dessa classe existe um método estático que faz a comparação pra gente
        //e garante que a ordem da nota (ou qualquer double) dentro do tipo de objeto que está implementado
        //seja sempre a crescente.
        return Double.compare(o1.getNota(), o2.getNota()); 
    }
}
