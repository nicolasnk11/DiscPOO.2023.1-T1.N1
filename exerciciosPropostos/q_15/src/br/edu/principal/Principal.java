package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//variaveis 
		 double salario;
		 double conta2 = 0.0;
		 double conta1 = 0.0;
		 double multa1 = 0.0;
		 double multa2 = 0.0;
		 double valorFinal = 0.0;
		 double valorFinal2= 0.0;
		 double multaTotal = 0.0;
		 double salarioFinal= 0.0;
		 //enfeite
	  System.out.println("##############################");
	  System.out.println("#   cauculadora de salario   #");
	  System.out.println("##############################");
	  System.out.println(" ");
	  //entradas
	  Scanner sc = new Scanner (System.in);
	  
	  System.out.println("digite seu salario: ");
	  salario = sc.nextDouble();
	  System.out.println("digite o valor da fatura 1: ");
	  conta1 = sc.nextDouble();
	  System.out.println("digite o valor da fatura 2: ");
	  conta2 = sc.nextDouble();
	  
	 //cauculos
	  multa1 = conta1 * 2/100;
	  multa2 = conta2 * 2/100;
	  valorFinal = conta1 + multa1;
	  valorFinal2 = conta2 + multa2;
	  multaTotal = valorFinal + valorFinal2;
	  salarioFinal = salario - multaTotal;
	  

	  System.out.println("O valor total das contas e da multa é de :R$ " + multaTotal);
	  System.out.println("O que sobrou do seu salario foi:R$ " + salarioFinal);
	  

			

		}

	}