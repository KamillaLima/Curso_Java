package br.com.curso.quatro;

import java.util.Scanner;

public class Vinte_Cinco {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome;
		int idade = 0;
		System.out.println("Informe o seu nome: ");
		nome = sc.nextLine();

		System.out.println("Informe a sua idade: ");
		idade = sc.nextInt();

		char sobrenome;
		System.out.println("Informe a primeira letra de seu sobrenome:");
		sobrenome = sc.next().charAt(0); //comando para pegar a primeira letra digitada
		System.out.printf("O seu nome é %s ,a sua idade é %d e a primeira letra do seu sobrenome é %s ", nome, idade,sobrenome);
		sc.close();
	}

}
