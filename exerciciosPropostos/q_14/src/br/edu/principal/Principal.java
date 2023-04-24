package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*14. Faça um programa que receba o ano de nascimento de uma pessoa e o ano atual,
		calcule e mostre:
		a) a idade dessa pessoa em anos;
		b) a idade dessa pessoa em meses;
		c) a idade dessa pessoa em dias;
		d) a idade dessa pessoa em semanas.
		*/ 
System.out.println("##################################");
System.out.println("#   Caulculadora de nascimento   #");
System.out.println("##################################");
System.out.println(" ");
Scanner sc = new Scanner (System.in);
	int nascAno;
	int atualAno;
	int idaAno;
	int idaMes;
	int idaDia;
	int idaSemana;
			 //entrada de dados
			 System.out.println("qual seu ano de nascimento: ");
			 nascAno = sc.nextInt();
			 System.out.println("Qual o ano atual: ");
			 atualAno = sc.nextInt();
		     //cauculos🥲
			  idaAno=(atualAno - nascAno);
			  idaMes=(idaAno*12);
			  idaDia=(idaAno*365);
			  idaSemana=(idaMes*4);
			  //result
			  System.out.println("A idade da pessoa em anos é   : " + idaAno + " anos");
			  System.out.println("A idade da pessoa em meses é  : " + idaMes + " meses");
			  System.out.println("A idade de pessoa em dias é   : " + idaDia + " dias");
			  System.out.println("A idade da pessoa em semanas é: " + idaSemana+ " semanas");  
			}

		
		

}
