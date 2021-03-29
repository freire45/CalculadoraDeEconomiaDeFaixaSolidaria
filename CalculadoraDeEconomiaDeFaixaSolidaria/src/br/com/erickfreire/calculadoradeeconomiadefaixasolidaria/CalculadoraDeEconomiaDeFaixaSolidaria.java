package br.com.erickfreire.calculadoradeeconomiadefaixasolidaria;

import java.util.Scanner;

/**
 * Crie um programa em Java que calcula a economia de faixa solidaria
 * @author Erick Freire
 * @version 1 - Criado em 28-03-2021 as 19:55
 */

public class CalculadoraDeEconomiaDeFaixaSolidaria {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double qui;
		double preco;
		double taxaEst;
		double quiMedio;
		double pedagio;
		
		System.out.print("Informe quantos quilometros são dirigidos por dia: ");
		qui = entrada.nextDouble();
		
		System.out.print("Informe o preço do litro da gasolina: ");
		preco = entrada.nextDouble();
		
		System.out.print("Informe a média de Gasolina por litro: ");
		quiMedio = entrada.nextDouble();
		
		System.out.print("Informe o valor da Taxa De Estacionamento: ");
		taxaEst = entrada.nextDouble();
		
		System.out.print("Informe o valor do pedágio por dia: ");
		pedagio = entrada.nextDouble();
				
		System.out.printf("O valor gasto por dia é de: %.2f%n", ((qui / quiMedio)* preco) + taxaEst + pedagio );
	}

}
