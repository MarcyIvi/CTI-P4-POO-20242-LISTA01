package br.edu.principal;

import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double pes; double polegadas; double jardas; double milhas;
		
		System.out.print("Digite uma quanntidades pes: ");
		pes = scanner.nextDouble();
		
		polegadas = pes * 12;
		jardas = pes / 3;
		milhas = jardas / 1760;
		
		System.out.println("De pes para polegadas: " + polegadas );
		System.out.println("De pés para jardas: " + jardas);
		System.out.println("De pés para milhas: " + milhas);
		
		
		

	}

}
