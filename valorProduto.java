/*Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago*/

import java.util.Scanner;

public class nilo5 {

	public static void main(String[] args) {
		Scanner dados = new Scanner(System.in);
		
		System.out.println("Digite o Código do primeiro produto: ");
		int peca1 = dados.nextInt();
		
		System.out.println("digite quantas unidades: ");
		int unidade1 = dados.nextInt();
		
		System.out.println("digite o preço do produto: ");
		double valor1 = dados.nextDouble();
		
		System.out.println("Digite o código do segundo produto: ");
		int peca2 = dados.nextInt();
		
		System.out.println("digite quantas unidades: ");
		int unidade2 = dados.nextInt();
		
		System.out.println("digite o preço do produto: ");
		double valor2 = dados.nextDouble();
		
		double valorTotal1 = valor1 * unidade1;
		double valorTotal2 = valor2 * unidade2;
		
		System.out.println("codigo do primeiro produto: " + peca1 + " numeros de unidades: " + unidade1 + " valor a pagar: " + valorTotal1);
		System.out.println("codigo do primeiro produto: " + peca2 + " numeros de unidades: " + unidade2 + " valor a pagar: " + valorTotal2);
		
		
		dados.close();

	}

}
