package edu.conjuntos.agendadecontatos;

import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;


public class AgendaContatos {
    private Set<Contato> agendaContatos;

    public AgendaContatos() {
        agendaContatos = new HashSet<Contato>();
    }

    public void adicionarContato(String nome, int numero) {
        agendaContatos.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        List<String> nomes = new ArrayList<String>();
        

        for (Contato contato : agendaContatos) {
            
        }
        System.out.println(agendaContatos);
    }

}
