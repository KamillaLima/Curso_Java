package br.com.curso.dez;

import java.util.Scanner;

public class MainPessoasAltura_ex92 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int qtdCadastros = 0;
		do {
			System.out.println("Quantas pessoas serão cadastradas: ");
			qtdCadastros = sc.nextInt();
		} while (qtdCadastros <= 0);

		PessoasAltura_ex92[] listaPessoas = new PessoasAltura_ex92[qtdCadastros];
		for (int i = 0; i < listaPessoas.length; i++) {
			double altura = 0;
			String nome = "";
			int idade = 0;

			do {
				System.out.println("Nome:  ");
				nome = sc.next();
			} while (nome == "");

			do {
				System.out.println("Idade: ");
				idade = sc.nextInt();
			} while (idade <= 0);

			do {
				System.out.println("Altura: ");
				altura = sc.nextDouble();
			} while (altura <= 0);

			listaPessoas[i] = new PessoasAltura_ex92(nome, idade, altura);

		}

		double somarAlturas = 0;
		for (PessoasAltura_ex92 p : listaPessoas) {
			somarAlturas = somarAlturas + p.getAltura();
		}

		System.out.printf("A média de alturas é de %.2f %n", somarAlturas / listaPessoas.length);
		int porcentagemMenores = 0;
		System.out.println("As pessoas com menos de 16 anos e suas respectivas idades são: ");
		for (PessoasAltura_ex92 pMenoresIdade : listaPessoas) {
			if (pMenoresIdade.getIdade() < 16) {
				System.out.println("Nome: " + pMenoresIdade.getNome() + ", Idade: " + pMenoresIdade.getIdade());
				porcentagemMenores += 1;

			}
		}
		System.out.println("Sendo assim,a porcentagem de pessoa(s) com menos de 16 anos é de: "
				+ porcentagemMenores * 100 / listaPessoas.length + "%");

		sc.close();
	}

}
