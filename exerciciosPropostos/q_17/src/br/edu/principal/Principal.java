package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		System.out.println("##############################");
		System.out.println("#   Caulculadora de esfera   #");
		System.out.println("##############################");
		System.out.println(" ");
		Scanner sc = new Scanner (System.in);
		float raio;
		double Cump;
		double Area;
		double vol;
		float raio2;
		 //entrada de dados
		 System.out.println("Qual o raio da esfera: ");
		 raio = sc.nextFloat();
		 
	     //cauculos🥲
		 raio2 = raio * raio;
		 Cump = 2* 3.14 * raio;
		 Area = 4 * 3.14 * raio * raio;
		 vol = 4/3 * 3.14 * raio2 * raio;
		
		  //result
		  System.out.println("O cumprimento da esfera é     : " + Cump );
		  System.out.println("A Àrea desta esfera é         : " + Area + " m²" );
		  System.out.println("O volume desta esfera é       : " + vol  + "cm³");
		 
		}

}
