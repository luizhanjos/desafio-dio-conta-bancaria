package com.applicarion.contaterminal;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor, digite o número da Conta !");
		int nmConta = sc.nextInt();
		
		System.out.println("Por favor, digite o número da Agência !");
		String agencia = sc.next();
		
		sc.nextLine();
		System.out.println("Por favor, digite o seu Nome !");
		String nomeCliente = sc.nextLine();
		
		System.out.println("Por favor, digite o seu Saldo !");
		double saldo = sc.nextDouble();
		
		//formatando o numero da agencia
		String agenciaFormatada = agencia.substring(0, 3) + "-" + agencia.substring(3);
		
		System.out.println("Olá " + nomeCliente.toUpperCase() + ", obrigado por criar uma conta em nosso banco,"
				+ " sua agência é " + agenciaFormatada + ", conta " + nmConta + " e seu "
						+ "saldo R$" + saldo + " de já está disponível para saque.");
		
		sc.close();
	}
}