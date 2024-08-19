package edu.lista.ordenacaodepessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> listaDePessoas;

    public OrdenacaoPessoas() {
        //Inicia um ArrayList de Pessoa
        listaDePessoas = new ArrayList<Pessoa>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        listaDePessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<String> exibirNomeDasPessoas () {
        List<String> nomeDasPessoas = new ArrayList<String>();

        for (Pessoa pessoa : listaDePessoas) {
            nomeDasPessoas.add(pessoa.getNome());
        }

        return nomeDasPessoas;
    }

    public void ordenarPorIdade() {
       Collections.sort(listaDePessoas); //este sort usará o método compareTo de Pessoa;
    }

    public void ordenarPorAltura() {
        Collections.sort(listaDePessoas,comparadorDeAlturaDePessoa);
    }

    Comparator<Pessoa> comparadorDeAlturaDePessoa = new Comparator<Pessoa>() {
        public int compare(Pessoa o1, Pessoa o2) {

            //Ordena em ordem crescente de altura
            if(o1.getAltura() < o2.getAltura()){
                return -1;
            }
            else {
                return 0;
            }
        };
    };

}
