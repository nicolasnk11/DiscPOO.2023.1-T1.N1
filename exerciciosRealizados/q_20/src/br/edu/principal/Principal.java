package br.edu.principal;
import java.util.Scanner;

public class Principal {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double angulo,altura,radiano,escada;
		System.out.println("Digite o valor do �ngulo formado pela escada e o ch�o(valor em graus): ");
		angulo = sc.nextDouble();
		System.out.println("Digite o valor da altura da parede: ");
		altura = sc.nextDouble();
		radiano = angulo*3.14/180;
		escada = altura / Math.sin(radiano);
		System.out.printf("A medida da escada ser� de: %.2f",escada);
	}

}
