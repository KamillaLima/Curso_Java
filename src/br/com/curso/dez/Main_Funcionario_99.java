package br.com.curso.dez;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main_Funcionario_99 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cadastro;

		do {
			System.out.println("Quantidade de funcionários a serem cadastrados: ");
			cadastro = sc.nextInt();
		} while (cadastro <= 0);

		List<Funcionario> lista = new ArrayList<>();
		Random r = new Random();
		for (int i = 0; i < cadastro; i++) {
			Integer id = r.nextInt(1, 1000);
			String nome = "";
			Double salario;

			do {
				System.out.println();
				System.out.println("Informe o nome do funcionário: ");
				nome = sc.nextLine();
			} while (nome == "");

			do {
				System.out.println("Informe o salário: ");
				salario = sc.nextDouble();
			} while (salario <= 0);

			lista.add(new Funcionario(id, nome, salario));

		}

		for (Funcionario funcionario : lista) {
			System.out.println(funcionario);
		}
		int funcionarioAumento;
		do {
			System.out.println("Informe o ID do funcionário: ");
			funcionarioAumento = sc.nextInt();
		} while (funcionarioAumento <= 0);

		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getId().equals(funcionarioAumento) == true) {
				System.out.println();
				double aumento;
				do {
					System.out.println("Informe a porcentagem de aumento");
					aumento = sc.nextDouble();
				} while (aumento <= 0 || aumento >= 101);
				lista.get(i).aumentarSalario(aumento);

			} else if (i == lista.size() - 1) {
				System.out.println("Funcionário não existe no sistema");
			}

		}

		System.out.println(lista);
		sc.close();
	}
}
