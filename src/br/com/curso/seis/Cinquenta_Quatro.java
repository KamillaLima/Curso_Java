package br.com.curso.seis;

import java.util.Scanner;

public class Cinquenta_Quatro {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String marca;
		String nomeProduto;
		
		do {
			System.out.println("Informe a marca do produto: ");
			marca = in.nextLine();
		}while(marca==null);
	
		do {
			System.out.println("Informe o nome do produto: ");
			nomeProduto = in.nextLine();
		}while(nomeProduto == null);
	
		System.out.println("O nome do produto é " + nomeProduto + " e a sua marca é " + marca);
	
	}

}
