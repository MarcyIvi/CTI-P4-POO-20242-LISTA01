package br.edu.principal;

import java.util.Scanner;
public class Principal {
   public static void main(String[] args){
	   Scanner scanner = new Scanner(System.in);
	   double sal; double salReceber; double grat; double imposto;
	   
	   System.out.print("Seu salário base: ");
	   sal = scanner.nextDouble();
	   
	   grat = 50;
	   imposto = sal * 10/100;
	   salReceber = sal + grat - imposto;
	   System.out.println("O seu salário com gratificação e descontando os impostos é: " + salReceber);
	   
   }
}
