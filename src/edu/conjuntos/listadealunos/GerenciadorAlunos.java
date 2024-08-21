package edu.conjuntos.listadealunos;

import java.util.Set;
import java.util.TreeSet;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class GerenciadorAlunos {

    private Set<Aluno> setAlunos;

    public GerenciadorAlunos () {
        setAlunos = new HashSet<Aluno>();
    }

    public void adicionarAluno(String nome, int matricula, double media) {
        setAlunos.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(int matricula) {
        for (Aluno aluno : setAlunos) {
            if(aluno.getMatricula() == matricula) {
                setAlunos.remove(aluno);
            }
        }
    }

    public void exibirAlunosPorNome() {
        /*
         * Para que o TreeSet abaixo, funcione corretamente, é necessário implementar a interface Comparable
         * em alunos e, obvimente, criar o override do método compareTo.
        */
        
        Set<Aluno> alunosPorNome = new TreeSet<>(setAlunos);
        setPrinter(alunosPorNome);
    }

    private void setPrinter (Set<Aluno> setAlunos) {
        for (Aluno aluno : setAlunos) {
            System.out.println("A média do " + aluno.getNome() + " (matricula nº.:" + aluno.getMatricula() + ") é igual à " + aluno.getMedia());          
        }
    }

    public void exibirAlunos () {
        setPrinter(setAlunos);
    }

    public void exibirAlunosPorMedia() {
        List<Aluno> listaAlunosPorMedia = new ArrayList<>();
        for (Aluno aluno : setAlunos) {
            listaAlunosPorMedia.add(aluno);
        }
        Collections.sort(listaAlunosPorMedia, comparadorPorNota);
        Set<Aluno> setAlunosPorNota = new HashSet<Aluno>();
        for (Aluno aluno : listaAlunosPorMedia) {
            setAlunosPorNota.add(aluno);
        }
        setPrinter(setAlunosPorNota);
    }

    Comparator<Aluno> comparadorPorNota = new Comparator<Aluno>() {
        public int compare(Aluno o1, Aluno o2) {
            if (o1.getMedia() < o2.getMedia()){
                return -1;
            }
            else {
                return 0;
            }
        };
    };


}
