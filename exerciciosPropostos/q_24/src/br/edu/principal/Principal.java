package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//variaveis
		  double dinheiro;
		  float dolar = 1.80f;
		  float MarcoA = 2.00f;
		  float libra = 1.57f;
		  int resp = 0;
		  double realDolar;
		  double realMarco;
		  double realLibra;
		  //enfeite
		  System.out.println("*****************************");
		  System.out.println("* 😎 Conversor de moedas 😎 *");
		  System.out.println("*****************************");
		  System.out.println(" ");
		  //entradas
		  Scanner sc = new Scanner (System.in);
		  System.out.println("Selecione o tipo de conversao");
		  
		  do {
			  System.out.println("*************************");
			  System.out.println("* 1 = R$ -> U$          *");
	          System.out.println("* 2 = R$ -> D-Mark      *");
	          System.out.println("* 3 = R$ -> £           *");
	          System.out.println("* 0 = encerrar programa *");
	          System.out.println("*************************");
	          
	          resp = sc.nextInt();
	          
	          if(resp == 1){
	        	  System.out.println("Você selecionou DOLAR");
	        	  System.out.println("Digite abaixo o valor para conversao: ");
	        	  dinheiro = sc.nextDouble();
	        	  realDolar = dinheiro/dolar;
	        	  System.out.println("Você tem US  " + realDolar);
	        	  System.out.println("");
	        	  
	          }else if(resp == 2){
	        	  System.out.println("Você selecionou MARCO ALEMAO");
	        	  System.out.println("Digite abaixo o valor para conversao: ");
	        	  dinheiro = sc.nextDouble();
	        	  realMarco = dinheiro/MarcoA;
	        	  System.out.println("Você tem DEM " + realMarco);
	        	  System.out.println("");
	        	  
	          }else if(resp == 3){
	        	  System.out.println("Você selecionou LIBRA");
	        	  System.out.println("Digite abaixo o valor para conversao: ");
	        	  dinheiro = sc.nextDouble();
	        	  realLibra = dinheiro/libra;
	        	  System.out.println("Você tem £ " + realLibra);
	        	  System.out.println("");
	        	  
	          }else if(resp == 0){
	        	  System.out.println("PROGRAMA ENCERRADO!!");
	        	  
	        	  
	          }
			  
		  }while(resp >0 & resp <4);

			
		
			

		}

	}
		
