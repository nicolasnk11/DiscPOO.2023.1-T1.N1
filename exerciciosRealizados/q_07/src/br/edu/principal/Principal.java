package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
	float sal;	
	float salreceber;
	float imp;
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Digite o sal�rio do funcion�rio: R$");
	sal = sc.nextFloat();
	imp = (sal * 10)/100;
	salreceber = sal + 50 - imp;
	
	System.out.println("O sal�rio a ser recebido ser� de: R$" + salreceber);

}
}