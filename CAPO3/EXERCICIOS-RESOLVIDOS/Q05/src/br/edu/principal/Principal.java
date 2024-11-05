package br.edu.principal;

import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Double sal; Double perc; Double aumento; Double novoSal;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o salário do funcionario: ");
		sal = scanner.nextDouble();
		
		System.out.print("Digite o percentual de aumento salarial: ");
		perc = scanner.nextDouble();
		
		aumento = sal * perc/100;
		novoSal = sal + aumento;
		
		System.out.print("O salário com o aumento é: " + novoSal);
		

	}

}
