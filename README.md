# FiapRideEstudos — Java POO

Projeto de estudos desenvolvido durante a graduação em Ciência da Computação na FIAP, com foco na prática de **Programação Orientada a Objetos (POO) em Java**.

O projeto evolui aula após aula, aplicando conceitos teóricos em classes, objetos, métodos, relacionamentos e regras de negócio.

## Objetivos

- Compreender os fundamentos de classes e objetos.
- Aplicar encapsulamento para proteger os atributos.
- Utilizar construtores para inicializar objetos.
- Implementar métodos com regras de negócio e validações.
- Trabalhar com herança e reutilização de código.
- Aplicar polimorfismo por sobrescrita de métodos.
- Praticar modelagem UML com diagramas de classes no Astah.
- Desenvolver boas práticas de organização e legibilidade do código.

## Conceitos implementados

### 1. Classes e objetos

A classe `Livro` representa um livro e reúne informações como título, quantidade de páginas, gênero literário e autor.

No `SistemaPrincipal`, são criados objetos de diferentes tipos para demonstrar o funcionamento das classes.

### 2. Métodos e regras de negócio

A classe `Livro` possui métodos que permitem alterar a quantidade de páginas:

- `adicionarPaginas(int quantidade)`: adiciona páginas quando a quantidade informada é válida.
- `removerPaginas(int quantidade)`: remove páginas quando a quantidade é válida e o livro possui páginas suficientes.

Esses métodos aplicam validações para impedir operações inválidas.

### 3. Encapsulamento

Os atributos são declarados como `private`, restringindo o acesso direto a eles.

Métodos de acesso, como getters, permitem consultar informações do objeto. Os setters são utilizados internamente quando necessário para definir ou atualizar valores.

### 4. Construtores

Os construtores inicializam os objetos com as informações necessárias, utilizando `super(...)` nas classes filhas para inicializar a parte herdada de `Livro`.

### 5. Herança

O projeto utiliza `Livro` como classe mãe de duas classes especializadas:

- `Ebook`: representa um livro digital e possui o atributo `tamanhoArquivoMB`.
- `LivroFisico`: representa um livro físico e possui o atributo `pesoGramas`.

As duas classes herdam os atributos e comportamentos comuns de `Livro`, além de manterem suas próprias características.

### 6. Polimorfismo por sobrescrita

A classe `Livro` define o método:

`exibirDetalhes(): String`

As classes `Ebook` e `LivroFisico` sobrescrevem esse método utilizando a anotação `@Override`.

A implementação de `Ebook` acrescenta o tamanho do arquivo, enquanto a de `LivroFisico` acrescenta o peso do livro. Ambas reutilizam os detalhes comuns por meio de `super.exibirDetalhes()`.

No `SistemaPrincipal`, os dois tipos de objeto são armazenados em uma `List<Livro>` e percorridos por um laço `for`. A chamada ao mesmo método executa a implementação correspondente ao objeto.

## Estrutura do projeto

```text
FiapRideEstudos/
└── src/
    └── br/
        └── com/
            └── fiapride/
                ├── main/
                │   └── SistemaPrincipal.java
                └── model/
                    ├── Autor.java
                    ├── Livro.java
                    ├── Ebook.java
                    └── LivroFisico.java
```

## Tecnologias e ferramentas

- **Java** — linguagem de programação.
- **Eclipse IDE** — ambiente de desenvolvimento.
- **Git e GitHub** — versionamento e armazenamento do código.
- **Astah** — modelagem UML e diagramas de classes.

## Como executar

1. Abra o projeto no Eclipse.
2. Localize a classe `SistemaPrincipal.java` no pacote `br.com.fiapride.main`.
3. Execute o método `main`.
4. Observe no console os detalhes dos objetos `Ebook` e `LivroFisico`, incluindo suas informações específicas.

## Aprendizados

Este projeto é desenvolvido de forma incremental para consolidar os fundamentos de POO, praticar a implementação de soluções em Java e manter o código alinhado à modelagem UML.

Cada evolução busca reforçar a organização, a reutilização de código, a proteção do estado dos objetos e a aplicação dos conceitos estudados nas aulas.

---

Projeto pessoal de estudos — Ciência da Computação | FIAP.