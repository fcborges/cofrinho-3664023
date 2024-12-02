<details> <summary><b>Conteúdo do README.md</b></summary>

# Cofrinho de Moedas em Java

Este projeto implementa um sistema simples de gerenciamento de um cofrinho virtual, utilizando conceitos de **Programação Orientada a Objetos (POO)**, incluindo **herança**, **polimorfismo** e **tratamento de exceções**.

## Funcionalidades

O sistema permite que o usuário:

1. **Adicionar moedas:** Suporta moedas em **Real (BRL)**, **Dólar (USD)** e **Euro (EUR)**.
2. **Remover moedas:** Remove moedas específicas do cofrinho pelo índice.
3. **Listar moedas:** Mostra todas as moedas presentes no cofrinho.
4. **Calcular o total em Reais:** Converte todas as moedas para **Real (BRL)** e exibe o total acumulado.

## Tecnologias Utilizadas

- **Linguagem:** Java
- **IDE Recomendada:** Eclipse, IntelliJ IDEA ou qualquer IDE de sua preferência
- **Estrutura de Dados:** ArrayList para armazenar as moedas

## Estrutura do Projeto

ProjetoCofrinho/ │ ├── src/ │ ├── Cofrinho.java │ ├── Moeda.java │ ├── Real.java │ ├── Dolar.java │ ├── Euro.java │ └── Principal.java │ └── README.md


## Como Rodar o Projeto Localmente

### Pré-requisitos

- **Java JDK:** Certifique-se de que o JDK (versão 8 ou superior) esteja instalado.
- **IDE:** Recomenda-se o uso de uma IDE como **Eclipse** ou **IntelliJ IDEA**, mas você pode usar o terminal/console, se preferir.

### Passos:

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/fcborges/cofrinho-3664023.git
   cd cofrinho-3664023

Importe o projeto para sua IDE:

No Eclipse:
Selecione File > Import > General > Existing Projects into Workspace.
No IntelliJ IDEA:
Selecione Open e escolha a pasta do projeto.
Compile e execute:

Abra o arquivo Principal.java.
Execute o programa através do botão Run (ou pressione Shift + F10 no IntelliJ).
Teste o menu interativo:
Utilize o menu no terminal/console para interagir com o sistema. Insira valores usando o ponto (.) como separador decimal.

Possíveis Problemas
Valores decimais: Certifique-se de usar um ponto (.) como separador decimal (ex: 2.50 para dois reais e cinquenta centavos).
Entradas inválidas: O programa trata erros de entrada (ex: texto em vez de números), exibindo mensagens de erro e permitindo novas tentativas.

Autor
[Seu Nome]
Especialista em Engenharia de Software
[Seu Email ou LinkedIn]

</details>
