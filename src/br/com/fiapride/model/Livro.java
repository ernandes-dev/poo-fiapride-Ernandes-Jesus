package br.com.fiapride.model;

public abstract class Livro implements LivroCatalogavel {

    private String titulo;
    private int quantidadeDePaginas;
    private String generoLiterario;
    private Autor autor;

    public Livro(String titulo, int quantidadeDePaginas, String generoLiterario, Autor autor) {
        this.setTitulo(titulo);
        this.setQuantidadeDePaginas(quantidadeDePaginas);
        this.setGeneroLiterario(generoLiterario);
        this.setAutor(autor);
    }

    public void adicionarPaginas(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Erro: A quantidade de páginas para adicionar deve ser maior que zero.");
            return;
        }
        if (this.quantidadeDePaginas > Integer.MAX_VALUE - quantidade) {
            throw new ArithmeticException("Erro: Estouro de capacidade no número de páginas.");
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
            System.out.println("Erro: Quantidade de páginas insuficiente para remover.");
            return;
        }
        this.quantidadeDePaginas -= quantidade;
        System.out.println("Quantidade removida com sucesso!");
    }

    public String getTitulo() {
        return this.titulo;
    }

    private void setTitulo(String titulo) {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("Erro: O título do livro não pode ser nulo ou vazio.");
        }
        this.titulo = titulo;
    }

    public int getQuantidadeDePaginas() {
        return this.quantidadeDePaginas;
    }

    private void setQuantidadeDePaginas(int quantidade) {
        if (quantidade < 0) {
            throw new IllegalArgumentException("Erro: A quantidade de páginas não pode ser negativa.");
        }
        this.quantidadeDePaginas = quantidade;
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

    public Autor getAutor() {
        return this.autor;
    }

    private void setAutor(Autor autor) {
        if (autor == null) {
            throw new IllegalArgumentException("Erro: O autor do livro não pode ser nulo.");
        }
        this.autor = autor;
    }

    public abstract String getTipo();

    public String exibirDetalhes() {
        return "Tipo: " + this.getTipo()
                + "\nTítulo: " + this.getTitulo()
                + "\nPáginas: " + this.getQuantidadeDePaginas()
                + "\nGênero: " + this.getGeneroLiterario()
                + "\nAutor: " + this.getAutor().getNome();
    }
    
    @Override
    public String gerarDescricao() {
        return this.exibirDetalhes();
    }
}