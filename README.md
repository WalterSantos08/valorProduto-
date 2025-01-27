# Cálculo do Valor de Produtos em Java 🛒

Este programa em Java calcula o valor total a ser pago por dois produtos com base em suas quantidades e preços unitários.

## 📝 Descrição

O programa:

1. Solicita ao usuário:
   - O código do primeiro produto.
   - A quantidade de unidades do primeiro produto.
   - O preço unitário do primeiro produto.
   - O código do segundo produto.
   - A quantidade de unidades do segundo produto.
   - O preço unitário do segundo produto.
2. Calcula o valor total de cada produto multiplicando a quantidade pelo preço unitário.
3. Exibe o código, quantidade e valor total de cada produto.

## 🚀 Como executar

1. Certifique-se de ter o [Java JDK](https://www.oracle.com/java/technologies/javase-downloads.html) instalado em sua máquina.
2. Clone este repositório ou copie o código.
3. Compile o arquivo Java:
   ```bash
   javac valorProduto.java
   ```
4. Execute o programa:
   ```bash
   java valorProduto
   ```

## 🕹️ Como usar

1. Ao executar o programa, insira as informações solicitadas:
   - Código do primeiro produto, quantidade e preço unitário.
   - Código do segundo produto, quantidade e preço unitário.
2. O programa calculará e exibirá o valor total de cada produto.

### Exemplo

Entrada:
```
Digite o Código do primeiro produto:
101
Digite quantas unidades:
3
Digite o preço do produto:
10.50
Digite o código do segundo produto:
202
Digite quantas unidades:
5
Digite o preço do produto:
20.00
```

Saída:
```
codigo do primeiro produto: 101 numeros de unidades: 3 valor a pagar: 31.5
codigo do primeiro produto: 202 numeros de unidades: 5 valor a pagar: 100.0
```

## 📂 Estrutura do código

O código é composto por:

- **Leitura da entrada do usuário**: Usando `Scanner` para capturar os dados de cada produto.
- **Cálculo do valor total**: Multiplicando a quantidade pelo preço unitário.
- **Exibição do resultado**: Exibe o código, quantidade e valor total de cada produto.
  
---

