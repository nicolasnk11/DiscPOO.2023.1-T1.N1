package br.edu.principal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		double salFixo, valVenda, comiss, salNovo;
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Digite o salário fixo: ");
		salFixo = sc.nextDouble();
		
		System.out.print("Digite o valor das vendas: ");
		valVenda = sc.nextDouble();
		comiss = ((4 * valVenda)/100);
		salNovo = (comiss + salFixo);
		
		System.out.println("O valor da comissão foi R$" + df.format(comiss));
		System.out.println("O valor do salário novo foi de R$" + df.format(salNovo));
		
	}
	
}
