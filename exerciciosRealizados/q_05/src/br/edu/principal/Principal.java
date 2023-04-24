package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
  
  double sal = 0;
  double perc = 0;
  double aumento = 0;
  double novosal = 0;
  
  Scanner sc = new Scanner(System.in);
  System.out.println("Digite o salário atual");
  sal = sc.nextDouble();
  
  System.out.println("Digite o percentual");
  perc = sc.nextDouble();
  
  aumento = sal * perc/100;
  
  System.out.println(novosal = sal + aumento);
  
  
  
  
  
	}

}
