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

    @Override
    public String toString() {
        return "Convidado [nomeConvidado=" + nomeConvidado + ", codigoConvite=" + codigoConvite + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + codigoConvite;
        return result;
    }

    //Método da Classe Objeto que é sobrescrevido dentro da Classe Convidado: este método 
    //garante que não podem haver codigos de convite (codigoConvite) iguais dentro de possiveis
    //sets que serão gerados com objetos desse Tipo.
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Convidado other = (Convidado) obj;
        if (codigoConvite != other.codigoConvite)
            return false;
        return true;
    }

    
}
