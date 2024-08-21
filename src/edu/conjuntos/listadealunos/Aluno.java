package edu.conjuntos.listadealunos;

import java.util.Comparator;

import edu.conjuntos.cadastrodeprodutos.Produto;

public class Aluno implements Comparable<Aluno> {
    private String nome;
    private int matricula;
    private double media;

    public Aluno (String nome, int matricula, double media) {
        this.nome = nome;
        this.matricula = matricula;
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    @Override
    public int compareTo(Aluno o) {
        return this.nome.compareTo(o.nome);
    }
}
    