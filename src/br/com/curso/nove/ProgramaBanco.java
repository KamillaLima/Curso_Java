package br.com.curso.nove;

import java.util.Scanner;

public class ProgramaBanco {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		long numeroConta = 0;
		String nomeCompleto = "" ;
		String depositoInicial = "" ;
		BancoCliente cliente;
		double valDepInicial = 0 ;
		do {
		System.out.print("Informe o número da conta: ");
		numeroConta = sc.nextLong();
		}while(numeroConta == 0);
		
		sc.nextLine();
		do {
			System.out.print("Informe o nome completo: ");
			nomeCompleto = sc.nextLine();
		}while(nomeCompleto == "");
		
		do {
			System.out.print("Você gostaria de realizar um depósito inicial? [S]im ou [N]ao: ");
			depositoInicial = sc.next().toUpperCase();
		}while(depositoInicial == "");
		
		if(depositoInicial.equals("S")) {
			do  {
				System.out.print("Informe o valor a ser depositado: R$");
				valDepInicial = sc.nextDouble();
			}while(valDepInicial <=0);
			cliente = new BancoCliente(numeroConta,nomeCompleto,valDepInicial);
		}else{
			cliente = new BancoCliente(numeroConta,nomeCompleto);
					
		}
		
		System.out.println(cliente);
		
		
		double valorInserir = 0;
		double valorSacar = 0 ;
		String nomeAtualizado = "";
		do {
			System.out.print("Informe o valor a ser depositado:  R$");
			valorInserir = sc.nextDouble();
		}while(valorInserir <= 0);
		cliente.deposito(valorInserir);
		
		
		do {
			System.out.print("Informe o valor a ser sacado: R$");
			valorSacar = sc.nextDouble();
		}while(valorSacar <= 0);
		boolean possoSacar = cliente.saldoDisponivel(valorSacar);
		if(possoSacar == true) {
			cliente.sacar(valorSacar);
		}else {
			System.out.println("Voce não possui saldo suficiente");
		}
		
		
		sc.nextLine();
		do {
			System.out.print("Informe o nome completo a ser atualizado: ");
			nomeAtualizado = sc.nextLine();
		}while(nomeAtualizado == "");
		cliente.setNomeCompleto(nomeAtualizado);
	
		
		
		
		System.out.println(cliente);
		
		
		sc.close();
	}

}
