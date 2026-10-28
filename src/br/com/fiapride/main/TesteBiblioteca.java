package br.com.fiapride.main;

import br.com.fiapride.model.Biblioteca;
import br.com.fiapride.model.LivroFisico;
import br.com.fiapride.model.Autor;

public class TesteBiblioteca {

    public static void main(String[] args) {
    	
    	Autor autor1 = new Autor("J. R. R. Tolkien", "Fantasia", 20);
    	
    	
    	LivroFisico livro1 = new LivroFisico(500, "O Hobbit", 310, "Fantasia", autor1);

    	Biblioteca biblioteca1 = new Biblioteca("Biblioteca FIAP", livro1);

    	biblioteca1.exibirResumo();
    	
    	livro1.adicionarPaginas(50);
    	
    	System.out.println("Paginas do livro através da Biblioteca: " + biblioteca1.getLivroDisponivel().getQuantidadeDePaginas());
    	System.out.println("Autor do livro: " + livro1.getAutor().getNome());
    }
}