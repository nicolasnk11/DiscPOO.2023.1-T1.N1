package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		System.out.println("############################");
		System.out.println("#   Calculadora de Àrea  #");
		System.out.println("############################");
		System.out.println(" ");
		System.out.println("Digite o tamanho do lado abaixo: ");
		Scanner ladinho = new Scanner (System.in);
		float Lado = ladinho.nextFloat();
		float area = Lado * Lado;
		System.out.println("A area do seu quadrado é: " + area);
	}

}