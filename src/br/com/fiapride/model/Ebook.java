package br.com.fiapride.model;

public class Ebook extends Livro {

    private double tamanhoArquivoMB;

    public Ebook(double tamanhoArquivoMB, String titulo, int quantidadeDePaginas, String generoLiterario, Autor autor) {
        super(titulo, quantidadeDePaginas, generoLiterario, autor);
        this.setTamanhoArquivoMB(tamanhoArquivoMB);
    }

    public double getTamanhoArquivoMB() {
        return this.tamanhoArquivoMB;
    }

    private void setTamanhoArquivoMB(double tamanhoArquivoMB) {
        if (tamanhoArquivoMB <= 0 || Double.isNaN(tamanhoArquivoMB) || Double.isInfinite(tamanhoArquivoMB)) {
            throw new IllegalArgumentException("Erro: O tamanho do arquivo em MB deve ser um valor positivo e finito.");
        }
        this.tamanhoArquivoMB = tamanhoArquivoMB;
    }

    @Override
    public String getTipo() {
        return "E-book";
    }

    @Override
    public String exibirDetalhes() {
        return super.exibirDetalhes()
                + "\nTamanho do arquivo: "
                + this.getTamanhoArquivoMB() + " MB";
    }
}