# Teste_Software_2024_Chagas_Andrey

# Projeto de Teste com Mockito
Esta é a Atividade 1 – Testes Unitários e o Stack Overflow da disciplina de Teste de Software

## Descrição do Problema

O usuário no StackOverflow estava enfrentando dificuldades ao tentar usar o Mockito para verificar se o método `someMethod` de uma instância da classe `Bar` foi chamado exatamente uma vez após a execução do método `foo` da classe `Foo`. O problema ocorre porque o código original cria uma nova instância de `Bar` dentro do método `foo`, impedindo a substituição dessa instância por um mock durante os testes.

## Descrição da Solução

A solução para esse problema envolve a refatoração do código para usar uma fábrica (factory) para criar instâncias de `Bar`. Isso permite que a instância de `Bar` seja mockada e verificada corretamente nos testes. A solução aceita no StackOverflow sugere a injeção da instância de `Bar` por meio de uma fábrica, possibilitando o controle da instância utilizada no método `foo`.

## Configuração do Ambiente

### Requisitos
- **IDE**: Recomendo usar IntelliJ para desenvolvimento em Java.

### Clonar o Repositório

No seu terminal, execute:
```bash
git clone https://github.com/AndreyFellipe/Teste_Software_2024_Chagas_Andrey
```
Em seguida, abra a pasta clonada na sua IDE.

### Executando o Código

Existem duas branches no repositório: main e CodigoComErro.

#### Testando o Código com Erro
Para testar o código com erro, siga os passos abaixo:

Faça checkout da branch CodigoComErro:
```bash
git checkout CodigoComErro
```
Rode o código que se encontra em src/test/java/com/exemplo/FooTest, o arquivo FooTest.java.

#### Testando a Solução Proposta
Para testar a solução proposta, siga os passos abaixo:

Restaure qualquer modificação feita anteriormente:
```bash
git restore .
```
Faça checkout da branch main:
```bash
git checkout main
```
Rode o código que se encontra em src/test/java/com/exemplo/FooTest, o arquivo FooTest.java.

## Documentação

Para mais detalhes, consulte o [relatório completo em PDF](https://github.com/AndreyFellipe/Teste_Software_2024_Chagas_Andrey/blob/main/Andrey_Fellipe_atividade_1.pdf).
