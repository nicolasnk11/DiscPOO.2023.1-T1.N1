package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		float nota1, nota2;
		double media1, media2, mediaTotal;
		Scanner sc = new Scanner (System.in);
		System.out.println("#############################");
		System.out.println("#   Calculadora de Média   #");
		System.out.println("#############################");
		System.out.println(" ");
		//pedir nota 1 e multiplicar por 2
		System.out.println("Digite a sua PRIMEIRA nota: ");
		nota1 = sc.nextFloat();
		media1 = nota1 * 2;
		//pedir nota  e multiplicar por 3
		System.out.println("Digite a sua SEGUNDA nota: ");
		nota2 = sc.nextFloat();
		media2 = nota2 * 3;
		mediaTotal = media1 + media2;
		//pegar mediaTotal dividir por 5 e imprimir para o usuario
		double MediaFinal = mediaTotal / 5;
		
		System.out.println("sua Media Final é: " + MediaFinal);
		if(MediaFinal>6) {
			System.out.println("Você foi APROVADO(A)!!!");
		}else {
			System.out.println("Você foi REPROVADO(A)!!!");
		}
		

	}

		
}

