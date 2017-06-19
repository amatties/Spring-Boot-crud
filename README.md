# Spring-Boot-crud

***
Projeto de um crud simples utilizando o Spring Boot 
***


***
## O que é Spring Boot?

O Spring Boot é um framework que tem como base um núcleo de funcionalidades como injeção de dependências, gerenciamento de dados com JPA, segurança, dentre outros, ele surgiu como uma alternativa ao Java EE.

Uma das principais características desse framework é fornecer um nível maior de produtividade pois é de fácil configuração.
***

## Requisitos

Por padrão requer **Spring Boot 1.5.4.RELEASE** requer **Java 7** e **Spring Framework 4.3.9.RELEASE**



***

## Instalação

O Spring Boot não necessita de instalação em si.

Facilmente pode ser gerado um novo projeto base acessando a ferramenta disponível abaixo:


http://start.spring.io/


Nessa ferramenta já é possível escolher as dependências que serão utilizadas isso facilita muito o trabalho de configuração, o arquivo principal do projeto é o **pom.xml** nele serão configuras todas as dependências.

A classe principal também será gerada automaticamente, o método main é o gatilho que será responsável por iniciar a aplicação.
***

## Documentação

A documentação oficial pode ser encontrada em: http://docs.spring.io/spring-boot/docs/current/reference/html/index.html

Só está disponível na língua inglesa.

***

## Vantagens

 Facilita o processo de configuração e criação das aplicações, torna muito mais facil iniciar um novo projeto do 'zero'.
 
 
 
 ***
 
 ## Desvantagens
 
 
 As desvantagens ou problemas encontrados são referente a documentação, existe muito dela disponível sim, mas muita coisa em versões descontinuadas ou não utilizando corretamente as opções do framework.
 
 
 
 ***
 
 ## Site oficial
 
 http://projects.spring.io/spring-boot/
 
 ***
 
 ## Sobre o projeto aqui apresentado

### Link para o vídeo da criação do projeto 

https://www.youtube.com/watch?v=027GKlqcQ_Y

### Alguns detalhes para execução


Adicionar a linha abaixo no arquivo aplication.properties se for executar o projeto pela primeira vez.

Com essa configuração o Framework irá criar automaticamente a tabela no banco de dados sempre que o projeto for executado.

```
spring.jpa.hibernate.ddl-auto=create-drop
```
