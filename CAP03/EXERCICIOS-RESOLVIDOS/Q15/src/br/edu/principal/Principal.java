package br.edu.principal;

import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		double pFab; double percD; double percI; double vrlD; double vrlI; double pFinal;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o preço de fabrica: ");
		pFab = scanner.nextDouble();
		
		System.out.print("Digite o percentual do destribuidor: ");
		percD = scanner.nextDouble();
		
		System.out.print("Digite o percentual de Imposto: ");
		percI = scanner.nextDouble();
		
		vrlD = pFab * percD / 100;
		vrlI = pFab * percI / 100;
		
		pFinal = pFab + vrlD + vrlI;
		
		System.out.println("O valor do destribuidor é: " + vrlD);
		System.out.println("O valor de imposto é: " + vrlI);
		System.out.println("O valor final do caro novo é: " + pFinal);
		
		

	}

}
