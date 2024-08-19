package edu.lista.catalogosdelivros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    //atributos
    List<Livro> listaDeLivros;

    //construtor
    public CatalogoLivros () {
        listaDeLivros = new ArrayList<Livro>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        /*
         * listaDeLivros é uma ArrayList: add adiciona (entre outras opções) um novo objeto ao ArrayList.
         * Nesse caso, este array foi inicializado com um tipo específico de objeto, o da Classe Livro,
         * pois está classe está entre o operador diamante: <Livro>;
         * A classe livro tem um método construtor que exige alguns atributos no momento da inicialização
         * de um novo objeto Livro.
         */
        listaDeLivros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<String> pesquisarPorAutor(String autor) {
        //Cria uma nova Lista de objetos to tipo String que comportará uma lista com os titulos de livros de um autor;
        List<String> listaTituloPorAutor = new ArrayList<String>();
        //Cria uma nova Lista de objetos do tipo Livro que comportará os objetos Livro com o nome do autor especificado no método;
        List<Livro> listaLivroPorAutor = new ArrayList<Livro>();
        
        //itera sobre os livros da lista de livros principal:
        for (Livro livro : listaDeLivros) {
            if (livro.getAutor().equalsIgnoreCase(autor)){
                //adiciono o objeto do tipo Livro à lista de livros
                listaLivroPorAutor.add(livro);
                //adiciono o objeto do tipo String como titulo do livro;
                listaTituloPorAutor.add(livro.getTitulo());
            }
        }

        return listaTituloPorAutor;
    }

    //Pesquisa livros publicados em um determinado intervalo de anos e retorna uma lista com os livros encontrados.
    public List<String> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){ 
        List<String> nomeDoLivrPorAno = new ArrayList<>();
        
        for (Livro livro : listaDeLivros) {
            if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
                nomeDoLivrPorAno.add(livro.getTitulo());
            }
        }

        return nomeDoLivrPorAno;
    }
    
    //Pesquisa livros por título e retorna o primeiro livro encontrado.
    public String pesquisarPorTitulo(String titulo) {
        for (Livro livro : listaDeLivros) {
            if(livro.getTitulo().equalsIgnoreCase(titulo)){
                return livro.getTitulo() + " do autor " + livro.getAutor() + " foi encontrado!"; //o return já dá break no loop
            }
        }
        return "Nenhum livro com este título foi encontrado.";
    }
}
