# FiapRideEstudos — Java POO

Projeto de estudos desenvolvido durante a graduação em Ciência da Computação na FIAP, com foco na prática de **Programação Orientada a Objetos (POO) em Java**.

O projeto evolui aula após aula, aplicando conceitos teóricos em classes, objetos, métodos, relacionamentos, herança, polimorfismo e regras de negócio.

## Objetivos

- Compreender os fundamentos de classes e objetos.
- Aplicar encapsulamento para proteger os atributos.
- Utilizar construtores para inicializar objetos.
- Implementar métodos com regras de negócio e validações.
- Trabalhar com herança e reutilização de código.
- Aplicar polimorfismo por sobrescrita de métodos.
- Utilizar classes abstratas e métodos abstratos.
- Praticar modelagem UML com diagramas de classes no Astah.
- Desenvolver boas práticas de organização e legibilidade do código.

## Conceitos implementados

### 1. Classes e objetos

A classe `Livro` reúne características comuns aos livros, como título, quantidade de páginas, gênero literário e autor.

A classe `Autor` representa o autor associado ao livro. No projeto, diferentes classes de teste permitem experimentar a criação e o funcionamento dos objetos.

### 2. Métodos e regras de negócio

A classe `Livro` possui métodos para alterar a quantidade de páginas:

- `adicionarPaginas(int quantidade)`: adiciona páginas quando a quantidade informada é válida.
- `removerPaginas(int quantidade)`: remove páginas quando a quantidade é válida e o livro possui páginas suficientes.

Esses métodos aplicam validações para impedir operações inválidas.

### 3. Encapsulamento

Os atributos são declarados como `private`, restringindo o acesso direto a eles.

Métodos de acesso, como getters, permitem consultar as informações dos objetos. Os setters privados são utilizados internamente para definir os valores dos atributos.

### 4. Construtores

Os construtores inicializam os objetos com as informações necessárias.

Nas classes filhas, a chamada `super(...)` invoca o construtor da classe mãe para inicializar os atributos herdados de `Livro`.

### 5. Herança

O projeto utiliza `Livro` como classe mãe de duas classes especializadas:

- `Ebook`: representa um livro digital e possui o atributo `tamanhoArquivoMB`.
- `LivroFisico`: representa um livro físico e possui o atributo `pesoGramas`.

As duas subclasses herdam os atributos e comportamentos comuns de `Livro` e mantêm suas próprias características específicas.

### 6. Classes abstratas e métodos abstratos

Na Aula 8, a classe `Livro` foi transformada em uma classe abstrata utilizando a palavra-chave `abstract`.

Essa alteração impede a criação direta de objetos da classe `Livro`, que passa a representar uma estrutura comum para suas subclasses. Ela continua podendo ser utilizada como tipo de referência.

A classe declara o método abstrato `getTipo(): String`, que estabelece um comportamento obrigatório para as classes concretas que herdam de `Livro`.

As implementações são:

- `Ebook`: retorna `"E-book"`.
- `LivroFisico`: retorna `"Livro físico"`.

Cada subclasse fornece sua própria implementação do método abstrato.

### 7. Polimorfismo por sobrescrita

A classe `Livro` define o método concreto `exibirDetalhes(): String`, responsável por reunir as informações comuns do livro.

As classes `Ebook` e `LivroFisico` sobrescrevem esse método utilizando a anotação `@Override` e a chamada `super.exibirDetalhes()` para reutilizar as informações da classe mãe.

A implementação de `Ebook` acrescenta o tamanho do arquivo, enquanto a de `LivroFisico` acrescenta o peso do livro.

O método `getTipo()` também é sobrescrito pelas subclasses, retornando a categoria correspondente a cada objeto.

No `SistemaPrincipal`, os objetos são armazenados em uma `List<Livro>` e percorridos por um laço `for`. A chamada aos métodos demonstra o polimorfismo, pois o comportamento executado depende do tipo concreto do objeto.

### 8. Classes de teste

O projeto possui classes destinadas a executar e verificar diferentes partes da implementação:

- `TesteMeuLivro`: classe de teste relacionada a livros.
- `TesteAutor`: classe de teste relacionada a autores.
- `TesteBiblioteca`: classe de teste relacionada à biblioteca.
- `SistemaPrincipal`: classe principal utilizada para executar a demonstração atual com e-books e livros físicos.

### 9. Modelagem UML

O projeto utiliza diagramas de classes desenvolvidos no Astah para representar a estrutura das classes e seus relacionamentos.

A modelagem contempla a classe abstrata `Livro`, suas subclasses `Ebook` e `LivroFisico`, os atributos, os métodos e as relações de herança.

## Estrutura do projeto

```text
FiapRideEstudos/
└── src/
    └── br/
        └── com/
            └── fiapride/
                ├── main/
                │   ├── TesteMeuLivro.java
                │   ├── TesteAutor.java
                │   ├── TesteBiblioteca.java
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
2. Localize a classe `SistemaPrincipal.java`, no pacote `br.com.fiapride.main`.
3. Execute o método `main`.
4. Observe no console os detalhes dos objetos `Ebook` e `LivroFisico`, incluindo suas informações específicas.

As classes `TesteMeuLivro`, `TesteAutor` e `TesteBiblioteca` também podem ser executadas individualmente caso possuam um método `main`.

## Aprendizados

O projeto é desenvolvido de forma incremental para consolidar os fundamentos de Programação Orientada a Objetos e aplicar os conceitos estudados nas aulas da FIAP.

As implementações praticam encapsulamento, construtores, validações, herança, classes abstratas, métodos abstratos, sobrescrita e polimorfismo, mantendo o código organizado e alinhado à modelagem UML.

---

Projeto pessoal de estudos — Ciência da Computação | FIAP.