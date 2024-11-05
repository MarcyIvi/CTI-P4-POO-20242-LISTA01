package br.edu.principal;

import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double real; double pFracionaria; int pInteira; int arredondamento;
		
		System.out.print("Digite o número real: ");
		real = scanner.nextDouble();
		
		pInteira = (int) real;
		pFracionaria = real - pInteira;
		arredondamento = (int) Math.round(real);
		
		System.out.println("Parte inteira: " + pInteira);
		System.out.println("Parte Fracionaria: " + pFracionaria);
		System.out.print("Digite o número real: " + arredondamento);
		
		
		
		
		
		
		
		

	}

}
