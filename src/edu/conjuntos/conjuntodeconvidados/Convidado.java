package edu.conjuntos.conjuntodeconvidados;

public class Convidado {
    
    //Atributos

    private String nomeConvidado;
    private int codigoConvite;

    //Construtor classe Convidado:

    public Convidado(String nomeConvidado, int codigoConvite) {
        this.nomeConvidado = nomeConvidado;
        this.codigoConvite = codigoConvite;
    }

    public String getNomeConvidado() {
        return nomeConvidado;
    }

    public void setNomeConvidado(String nomeConvidado) {
        this.nomeConvidado = nomeConvidado;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }

    public void setCodigoConvite(int codigoConvite) {
        this.codigoConvite = codigoConvite;
    }
    
}
