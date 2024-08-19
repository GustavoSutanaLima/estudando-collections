package edu.lista.ordenacaodepessoas;

public class Pessoa implements Comparable<Pessoa> {
    private String nome;
    private int idade;
    private double altura;

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    /* Após a implementação da interface Comparable em Pessoa, é exigida a implementação do método abstrato 
     * compareTo. Este método compara outros objetos do mesmo tipo que a classe em que foi implementado.
     */
    @Override
    public int compareTo(Pessoa outraPessoa) {
        if (this.idade > outraPessoa.idade) {
            return 1;
        }
        else if (this.idade < outraPessoa.idade) {
            return -1;
        }
        return 0;
    }
}   

