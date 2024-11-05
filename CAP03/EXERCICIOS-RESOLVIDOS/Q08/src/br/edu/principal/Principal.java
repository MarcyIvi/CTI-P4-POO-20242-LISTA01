package br.edu.principal;

import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double aumento;
		
		System.out.print("Digite o valor do depósito: ");
		double deposito = scanner.nextDouble();
		System.out.print("Digite a taxa de juros: ");
		double taxa = scanner.nextDouble() / 100;
		
		aumento = deposito * taxa;
				
		System.out.println("Seu aumento foi de R$ " + aumento + ".");
		double novoSalario = deposito + aumento;
		System.out.println("Seu novo salário com aumento é R$ " + novoSalario + ".");
		

	}

}
