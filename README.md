# Sistema de Votação

Projeto acadêmico desenvolvido em Java que simula um sistema de votação,
permitindo o cadastro de votos, organização por seção, geração de indicadores
estatísticos e gravação dos dados em arquivo.

## 📌 Descrição
O sistema funciona por meio de janelas gráficas utilizando `JOptionPane`.
O usuário pode cadastrar votos informando o número da seção e do candidato,
classificar os registros por seção, gerar estatísticas de votação e salvar
os dados em um arquivo de texto.

Os indicadores permitem analisar a distribuição de eleitores por seção,
identificar a seção com maior e menor número de eleitores e verificar a
quantidade de votos por candidato.

## 🛠️ Tecnologias Utilizadas
- Java
- JOptionPane
- Programação Orientada a Objetos (POO)
- Manipulação de arquivos (`FileWriter`, `BufferedWriter`)

## 📂 Estrutura do Projeto
- `ProgramaPrincipal.java` — Classe principal que controla o menu do sistema
- `Métodos.java` — Contém os métodos de cadastro, classificação e gravação
- `Indicadores.java` — Responsável pelos cálculos e estatísticas de votação
- `Votação.java` — Classe modelo que representa um voto (seção e candidato)

## ⚙️ Funcionalidades
- Cadastro de votos (seção e candidato)
- Classificação dos votos por número da seção
- Geração de indicadores estatísticos:
  - Quantidade de eleitores por seção
  - Seção com maior e menor número de eleitores
  - Quantidade de votos por candidato
- Gravação dos registros em arquivo `.txt`

## ▶️ Como Executar
1. Compile todos os arquivos `.java`
2. Execute a classe `ProgramaPrincipal`
3. Utilize os menus exibidos em janelas para interagir com o sistema

## 📄 Arquivo Gerado
- `Votação2021.txt` — Contém os registros de votação gravados pelo sistema

## 📚 Conceitos Trabalhados
- Classes e objetos
- Construtores
- Vetores
- Estruturas de repetição e decisão
- Ordenação de dados
- Entrada e saída de dados
- Interface gráfica simples com JOptionPane

## 🎯 Objetivo Acadêmico
Projeto desenvolvido para fins educacionais, com foco na aplicação prática
dos conceitos de Programação Orientada a Objetos e lógica de programação em Java.
