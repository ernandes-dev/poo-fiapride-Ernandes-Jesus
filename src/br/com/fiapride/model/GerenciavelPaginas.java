package br.com.fiapride.model;

public interface GerenciavelPaginas {

    void adicionarPaginas(int quantidade);

    void removerPaginas(int quantidade);

    int getQuantidadeDePaginas();
}