package br.edu.principal;

import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double sal; double salReceber; double grat; double imposto;
		
		System.out.println("Digite seu salário base: ");
		sal = scanner.nextDouble();
		
		grat = sal * 5/100;
		imposto = sal * 7/100;
		salReceber = sal + grat - imposto;
		
		System.out.println("O seu salário com gratificação e descontando os impostos é: " + salReceber);
		
		
	}

}
