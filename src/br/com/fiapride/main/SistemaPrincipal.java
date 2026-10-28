package br.com.fiapride.main;

import br.com.fiapride.model.LivroFisico;
import br.com.fiapride.model.Autor;
import br.com.fiapride.model.Ebook;
import br.com.fiapride.model.Livro;
import java.util.ArrayList;
import java.util.List;

public class SistemaPrincipal {

    public static void main(String[] args) {
    	
    	System.out.println("--- Teste Sistema Principal ---");
    	
    	Autor autor2 = new Autor("Neal Shusterman", "Ficção Científica", 20);
    	
    	Ebook kindle = new Ebook(80.0, "Scythe", 448, "Ficção Científica", autor2);
    	
     	LivroFisico capaDura = new LivroFisico(1000.0, "Thunderhead", 512, "Distopia", autor2);

    	List<Livro> livros = new ArrayList<>();
    	
    	livros.add(kindle);
    	livros.add(capaDura);
    	System.out.println("--------LIVROS INSERIDOS--------");
    	
    	for (Livro livro : livros) {	
    		System.out.println(livro.exibirDetalhes());
    		System.out.println("---------------------------------------");
    	}
    }
}