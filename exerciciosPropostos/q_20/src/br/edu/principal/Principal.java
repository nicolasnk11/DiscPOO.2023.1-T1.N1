package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Valor da hipotenusa(escada) com o angulo que o usuario dará
				Scanner sc = new Scanner(System.in);
				double angulo,altura,radiano,escada;
				System.out.println("Digite o valor do Ângulo formado pela escada e o chão(valor em graus): ");
				angulo = sc.nextDouble();
				System.out.println("Digite o valor da altura da parede: ");
				altura = sc.nextDouble();
				radiano = angulo*3.14/180;
				escada = altura / Math.sin(radiano);
				System.out.println("A medida da escada será de: " + escada);
			}

		}
		
