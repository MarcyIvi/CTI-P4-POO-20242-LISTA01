package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o salário do funcionário: ");
		double salario = scanner.nextDouble();
		
		double aumento = salario * 25/100;
		double salarioAumentado = salario + aumento;
		
		System.out.print("O salário do funcionário com aumento é: " + salarioAumentado);
	}
}
