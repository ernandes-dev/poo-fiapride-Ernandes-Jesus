package br.com.fiapride.main;

import br.com.fiapride.model.Autor;

public class TesteAutor {

    public static void main(String[] args) {
        // Teste válido
        Autor autor1 = new Autor("J. R. R. Tolkien", "Fantasia", 20);
        System.out.println(autor1.gerarDescricao());

        // Teste inválido capturando a exceção corretamente
        try {
            Autor autor2 = new Autor("Neal Shusterman", "Ficção Científica", -5);
        } catch (IllegalArgumentException e) {
            System.out.println("Exceção capturada com sucesso: " + e.getMessage());
        }
    }
}