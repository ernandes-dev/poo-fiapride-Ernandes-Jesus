package br.com.fiapride.model;

public class LivroFisico extends Livro {

    private double pesoGramas;

    public LivroFisico(double pesoGramas, String titulo,
            int quantidadeDePaginas, String generoLiterario, Autor autor) {

        super(titulo, quantidadeDePaginas, generoLiterario, autor);
        this.setPesoGramas(pesoGramas);
    }

    public double getPesoGramas() {
        return this.pesoGramas;
    }

    private void setPesoGramas(double pesoGramas) {
        this.pesoGramas = pesoGramas;
    }

    @Override
    public String getTipo() {
        return "Livro físico";
    }

    @Override
    public String exibirDetalhes() {
        return super.exibirDetalhes()
                + "\nPeso do livro: " + this.getPesoGramas() + " g";
    }
}