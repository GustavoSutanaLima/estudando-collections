package edu.conjuntos.conjuntodeconvidados;

import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

public class ConjuntoConvidados {

    //Atributos
    private Set<Convidado> conjuntoConvidados;

    //Construtor:ao inciar um objeto do tipo ConjuntoConvidado, um set vazio será criando;
    public ConjuntoConvidados(){
        conjuntoConvidados = new HashSet<Convidado>();
    }

    //Adiciona novo conidado ao set (conjunto) de convidados:
    public void adicionarConvidado(String nomeConvidado, int codigoConvite) {
        conjuntoConvidados.add(new Convidado(nomeConvidado, codigoConvite));
    }

    public void exibirConvidados(){
        for (Convidado convidado : conjuntoConvidados) {
            System.out.println(convidado.getNomeConvidado());
        }
    }

    public void contarConvidados() {
        System.out.println(conjuntoConvidados.size());
    }

    public void removerConvidadoPorCodigoConvite(int codigoConviteRemover) {
        for (Convidado convidado : conjuntoConvidados) {
            try {
                if (convidado.getCodigoConvite() == codigoConviteRemover) {
                    conjuntoConvidados.remove(convidado);
                }
            } catch (Exception e) {
                System.out.println("Convidadao Não encontrado");
            } 
        }
    }
    
}
