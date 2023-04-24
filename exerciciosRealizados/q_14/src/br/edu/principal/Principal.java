package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int ano_atual, ano_nascimento, idade_atual, idade_2005;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o ano atual: ");
		ano_atual = sc.nextInt();
		System.out.println("Digite o ano de nascimento da pessoa: ");
        ano_nascimento = sc.nextInt();
        idade_atual = ano_atual - ano_nascimento;
        idade_2005 = 2005 - ano_nascimento;
        System.out.println("A idade atual do indivíduo é " + idade_atual + " anos");
        System.out.println("A idade da pessoa em 2005 é " + idade_2005 + " anos");
        }
}
