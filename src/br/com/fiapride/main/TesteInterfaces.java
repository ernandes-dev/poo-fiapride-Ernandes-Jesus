package br.com.fiapride.main;

import br.com.fiapride.model.Autor;
import br.com.fiapride.model.Descritivel;
import br.com.fiapride.model.Ebook;
import br.com.fiapride.model.LivroFisico;
import br.com.fiapride.model.GerenciavelPaginas;
import br.com.fiapride.model.LivroCatalogavel;

public class TesteInterfaces {

    public static void main(String[] args) {

        Autor autor = new Autor(
                "Neal Shusterman",
                "Ficção Científica",
                20
        );

        Ebook ebook = new Ebook(
                80.0,
                "Scythe",
                448,
                "Ficção Científica",
                autor
        );

        LivroFisico livroFisico = new LivroFisico(
                1000.0,
                "Thunderhead",
                512,
                "Distopia",
                autor
        );

        Descritivel[] itens = {
                ebook,
                livroFisico,
                autor
        };

        System.out.println("=== TESTE DE INTERFACES ===");

        for (Descritivel item : itens) {
            System.out.println(item.gerarDescricao());
            System.out.println("-------------------------");
        }

        System.out.println("=== TESTE DE GERENCIAMENTO DE PÁGINAS ===");

        GerenciavelPaginas[] livrosGerenciaveis = {
            ebook,
            livroFisico
        };

        for (GerenciavelPaginas livro : livrosGerenciaveis) {
            livro.adicionarPaginas(2);

            System.out.println(
                "Total de páginas: " + livro.getQuantidadeDePaginas()
            );

            System.out.println("-------------------------");
        }

        System.out.println("=== CONTRATO COMBINADO ===");

        LivroCatalogavel[] catalogo = {
            ebook,
            livroFisico
        };

        for (LivroCatalogavel livro : catalogo) {
            System.out.println(livro.gerarDescricao());
            System.out.println("-------------------------");
        }
    }
}