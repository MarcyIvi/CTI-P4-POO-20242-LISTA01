package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		double somaNotas = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota: ");
		double nota1 = scanner.nextDouble();
		
		System.out.print("Digite a segunda nota: ");
		double nota2 = scanner.nextDouble();
		
		System.out.print("Digite a terceira nota: ");
		double nota3 = scanner.nextDouble();
		
		somaNotas = nota1 + nota2 + nota3;
		double media = somaNotas / 3;
		
		System.out.println("A media das notas é: " + media);
		
		

	}

}