package br.com.fiapride.model;

public class Biblioteca {
	
    private final String nome;
    private final Livro livroDisponivel;
	
    public Biblioteca(String nome, Livro livroDisponivel) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Erro: O nome da biblioteca não pode ser nulo ou vazio.");
        }
        if (livroDisponivel == null) {
            throw new IllegalArgumentException("Erro: O livro disponível na biblioteca não pode ser nulo.");
        }
        this.nome = nome;
        this.livroDisponivel = livroDisponivel;
    }

    public void exibirResumo() {
        System.out.println("Biblioteca: " + this.nome);
        System.out.println("Livro disponível: " + this.livroDisponivel.getTitulo());
    }
	
    public String getNome() {
        return this.nome;
    }

    public Livro getLivroDisponivel() {
        return this.livroDisponivel;
    }
}