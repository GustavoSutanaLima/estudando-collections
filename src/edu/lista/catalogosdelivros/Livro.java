package edu.lista.catalogosdelivros;

public class Livro {
    //Atributos:
    private String titulo;
    private String autor;
    private int anoPublicacao;

    //Método construtor
    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }
    
    //Padrão java beans: atributos PRIVADOS e métodos getters e setters para atribuilos e retorná-los:
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    
    
}
