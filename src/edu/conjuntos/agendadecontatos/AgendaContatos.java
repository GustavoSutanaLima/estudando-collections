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
        for (Contato contato : agendaContatos) {
            System.out.println(contato.getNome() + " - " + contato.getNumeroTelefone());
        }
        System.out.println(agendaContatos);
    }

    public Set<Contato> getAgenContatos() {
        return agendaContatos;
    }

    public Set<Contato> pesquisarPorNome (String nome) {
        Set<Contato> contatosComEsteNome = new HashSet<Contato>();

        for (Contato contato : agendaContatos) {
            if (contato.getNome().startsWith(nome)) {
                contatosComEsteNome.add(contato);
            }
        }

        return contatosComEsteNome;
    }

    public void atualizarNumeroContato(String nome, int novoNumero) {
        for (Contato contato : agendaContatos) {
            if(contato.getNome().equalsIgnoreCase(nome)) {
                contato.setNumeroTelefone(novoNumero);
            }
        }
    }

}
