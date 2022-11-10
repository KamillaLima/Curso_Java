package br.com.curso.dez;

import java.util.Scanner;

public class MainHotel_ex93 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ClientesHotel_ex93[] clientes = new ClientesHotel_ex93[10];
		int qtdAlugar = 0;
		do {
			System.out.println("Informe a quantidade de quartos necessária: ");
			qtdAlugar = sc.nextInt();
		}while(qtdAlugar<=0);
		
		for (int i = 0; i < qtdAlugar; i++) {
			String nome="" ;
			String email;
			int numQuarto;

			do {
				System.out.println("Informe o Nome: ");
				nome = sc.nextLine();
			}while(nome=="");
			
			do {
				System.out.println("Informe o email: ");
				email = sc.next();
			}while(email==null);
			
			
			do {
				System.out.println("Quarto a ser alugado : ");
				numQuarto = sc.nextInt();
			}while(numQuarto<=-1 || numQuarto>=11);
			
			clientes[numQuarto] = new ClientesHotel_ex93(nome,email,numQuarto);
		}
		
	
		
		for (int i = 0; i < clientes.length; i++) {
			if(clientes[i].getNome()!="") {
				System.out.println(clientes[i].getNome());
				System.out.println(clientes[i].getQuarto());
			}
			
		}
		
	}
	


}
