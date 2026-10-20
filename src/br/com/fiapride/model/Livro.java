package br.com.fiapride.model;

public abstract class Livro {

    private String titulo;
    private int quantidadeDePaginas;
    private String generoLiterario;
    private Autor autor;

    public Livro(String titulo, int quantidadeDePaginas,
            String generoLiterario, Autor autor) {

        this.setTitulo(titulo);
        this.setQuantidadeDePaginas(quantidadeDePaginas);
        this.setGeneroLiterario(generoLiterario);
        this.autor = autor;
    }

    public void adicionarPaginas(int quantidade) {

        if (quantidade <= 0) {
            System.out.println(
                    "Erro: A quantidade de páginas é insuficiente.");
            return;
        }

        this.quantidadeDePaginas += quantidade;
        System.out.println("Quantidade de páginas adicionada com sucesso!");
    }

    public void removerPaginas(int quantidade) {

        if (quantidade <= 0) {
            System.out.println("Erro: A quantidade informada é inválida.");
            return;
        }

        if (this.quantidadeDePaginas < quantidade) {
            System.out.println(
                    "Erro: Quantidade de páginas insuficiente para remover.");
            return;
        }

        this.quantidadeDePaginas -= quantidade;
        System.out.println("Quantidade removida com sucesso!");
    }

    public String getTitulo() {
        return this.titulo;
    }

    private void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getQuantidadeDePaginas() {
        return this.quantidadeDePaginas;
    }

    private void setQuantidadeDePaginas(int quantidade) {

        if (quantidade >= 0) {
            this.quantidadeDePaginas = quantidade;
        } else {
            System.out.println(
                    "Erro: A quantidade de páginas não pode ser negativa.");
        }
    }

    public String getGeneroLiterario() {
        return this.generoLiterario;
    }

    private void setGeneroLiterario(String generoLiterario) {
        this.generoLiterario = generoLiterario;
    }

    public Autor getAutor() {
        return this.autor;
    }

    public abstract String getTipo();

    public String exibirDetalhes() {

        return "Tipo: " + this.getTipo()
                + "\nTítulo: " + this.getTitulo()
                + "\nPáginas: " + this.getQuantidadeDePaginas()
                + "\nGênero: " + this.getGeneroLiterario()
                + "\nAutor: " + this.getAutor().getNome();
    }
}