package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("##############################");
		System.out.println("#  Calculadora de Desconto  #");
		System.out.println("##############################");
		System.out.println(" ");
		/*pedir o valor ao usuario*/
		System.out.println("ATENÇAO: Digite no seguinte formato:'0.000,00 etc...' ");
		System.out.println("Digite o preço do produto desejado abaixo: ");
		Scanner preço = new Scanner (System.in);
		float Prç = preço.nextFloat();
		/*Como o próprio nome já diz, porcentagem nada mais é do que o valor * taxa / 100*/
		double desc = 10.0 / 100.0;
		double Preço10 = Prç - (desc * Prç);
		System.out.println("O valor final com o desconto aplicado será: R$"+Preço10);
		
	}

}

