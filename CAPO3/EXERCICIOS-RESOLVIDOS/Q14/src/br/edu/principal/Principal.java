package br.edu.principal;

import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int anoAtual; int anoNascimento; int idadeAtual; int idade2050;
		
		System.out.print("Digite seu o ano atual: ");
		anoAtual = scanner.nextInt();
		
		System.out.print("Digite seu o ano de nascimento: ");
		anoNascimento = scanner.nextInt();
		
		idadeAtual = anoAtual - anoNascimento;
		idade2050  = 2050 - anoNascimento;
		
		System.out.println("Sua idade é: " + idadeAtual);
		System.out.println("Sua idade em 2050 é: " + idade2050);
		
		
		
		

	}

}
