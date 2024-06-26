# Documentação do ProjetoSpring

![Padrao do Projeto](https://github.com/Iuryppedrosa/springboot-mongodb/blob/main/319286550-88eed4af-9188-44a2-b33d-b9e8f0051d62.png?raw=true)

## Escopo do Projeto
O projeto `ProjetoSpring` tem o escopo de estudos sobre padrões de projetos, uso do Spring Boot, do banco de dados MongoDB e do padrão REST.

## Estrutura de Pastas
Aqui está a estrutura de pastas do projeto `ProjetoSpring`:


- **projetospring**: Raiz do projeto.
  - **.idea**: Configurações específicas do IntelliJ IDEA.
  - **.mvn**: Arquivos de configuração do Maven Wrapper.
  - **src**: Código fonte do projeto.
    - **main**: Código fonte principal.
      - **java**: Códigos Java do projeto.
        - **spring**: Pacote principal do Spring.
          - **config**: Classes de configuração.
          - **domain**: Entidades do domínio.
            - **User**: Classe de entidade do usuário.
            - **Post**: Classe de entidade para postagens.
            - **Comment**: Classe de entidade para comentários.
          - **dto**: Data Transfer Objects.
            - **UserDTO**: DTO para a entidade do usuário.
          - **repository**: Repositórios do Spring Data.
            - **UserRepository**: Repositório para a entidade do usuário.
            - **PostRepository**: Repositório para a entidade de postagem.
            - **CommentRepository**: Repositório para a entidade de comentário.
          - **resources**: Controladores REST.
            - **UserResource**: Controlador REST para a entidade do usuário.
            - **PostResource**: Controlador REST para a entidade de postagem.
            - **CommentResource**: Controlador REST para a entidade de comentário.
          - **services**: Serviços de negócio.
            - **exception**: Exceções personalizadas.
              - **ObjectNotFoundException**: Exceção para objeto não encontrado.
              - **ResourceExceptionHandler**: Manipulador de exceções de recursos.
              - **StandardError**: Modelo de erro padrão.
            - **UserServices**: Serviço para a entidade do usuário.
            - **PostServices**: Serviço para a entidade de postagem.
            - **CommentServices**: Serviço para a entidade de comentário.
        - **ProjetospringApplication**: Classe principal do Spring Boot.
      - **resources**: Recursos do projeto.
        - **static**: Arquivos estáticos como CSS, JS, imagens.
        - **templates**: Templates do Thymeleaf ou outro motor de template.
        - **application.properties**: Propriedades de configuração do Spring.
    - **test**: Testes do projeto.
  - **target**: Arquivos compilados e empacotados.
  - **.gitignore**: Arquivos e pastas ignorados pelo Git.
  - **HELP.md**: Arquivo Markdown com informações úteis sobre o projeto.
  - **mvnw**, **mvnw.cmd**: Scripts do Maven Wrapper.
  - **pom.xml**: Arquivo POM do Maven com configurações do projeto.

## Banco de Dados
O projeto utiliza o MongoDB como banco de dados. As entidades são mapeadas para coleções no banco.

## Entidades
### User
Representa um usuário no sistema. Atributos incluem `id`, `name` e `email`.

### Post
Representa uma postagem feita por um usuário. Atributos incluem `id`, `date`, `title` e `body`.

### Comment
Representa um comentário em uma postagem. Atributos incluem `id`, `text` e `date`.

## Relacionamentos

![UML de Classes](https://github.com/Iuryppedrosa/springboot-mongodb/blob/main/319286533-0fca3db2-4741-4fa6-8e10-1b0fc0c698f3.png?raw=true)

- Um `User` pode ter vários `Post`.
- Um `Post` pode ter vários `Comment`.

## Configuração
As configurações do projeto são definidas no arquivo `application.properties`.

## Execução
Para executar o projeto, utilize o comando `./mvnw spring-boot:run` no terminal.
