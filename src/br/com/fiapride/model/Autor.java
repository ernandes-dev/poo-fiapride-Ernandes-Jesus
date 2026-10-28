package br.com.fiapride.model;

public class Autor implements Descritivel {

    private String nome;
    private String generoLiterario;
    private int quantidadeDeLivros;

    public Autor(String nome, String generoLiterario, int quantidadeDeLivros) {
        this.setNome(nome);
        this.setGeneroLiterario(generoLiterario);
        this.setQuantidadeDeLivros(quantidadeDeLivros);
    }

    public String getNome() {
        return this.nome;
    }

    private void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Erro: O nome do autor não pode ser nulo ou vazio.");
        }
        this.nome = nome;
    }

    public String getGeneroLiterario() {
        return this.generoLiterario;
    }

    private void setGeneroLiterario(String generoLiterario) {
        if (generoLiterario == null || generoLiterario.trim().isEmpty()) {
            throw new IllegalArgumentException("Erro: O gênero literário não pode ser nulo ou vazio.");
        }
        this.generoLiterario = generoLiterario;
    }

    public int getQuantidadeDeLivros() {
        return this.quantidadeDeLivros;
    }

    private void setQuantidadeDeLivros(int quantidadeDeLivros) {
        if (quantidadeDeLivros < 0) {
            throw new IllegalArgumentException("Erro: A quantidade de livros não pode ser negativa.");
        }
        this.quantidadeDeLivros = quantidadeDeLivros;
    }

    @Override
    public String gerarDescricao() {
        return "Autor: " + this.nome + " | Gênero: " + this.generoLiterario + " | Livros: " + this.quantidadeDeLivros;
    }
}