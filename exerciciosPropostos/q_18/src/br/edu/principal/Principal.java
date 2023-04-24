package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		System.out.println("conversor de Celcius para Fahrenheit" );
		System.out.println("");
		System.out.println("Digite a temperatura abaixo: ");
		Scanner grau = new Scanner (System.in);
		float grauC = grau.nextFloat();
		double F = grauC * 1.8;
		double F2 = F + 32;	
		System.out.println(grauC+" Celcius convertido para Fahrenheit é igual a: "+ F2 + " graus Fahrenheit");	
}
}
