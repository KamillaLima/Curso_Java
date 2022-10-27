package br.com.curso.oito;

import java.util.Scanner;

public class Sessenta_nove_ex2_programa {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Sessenta_nove_ex2 funcionario = new Sessenta_nove_ex2();
		do{
		System.out.print("Informe o nome do funcionário: ");
		funcionario.nome = in.nextLine().trim();
		}while(funcionario.nome == null);
		
		do {
			System.out.print("Informe o salário bruto do funcionário: R$");
			funcionario.salarioBruto = in.nextDouble();
		}while(funcionario.salarioBruto <= 0);
		
		do {
			System.out.print("Informe o valor dos impostos: R$");
			funcionario.imposto = in.nextDouble();
		}while(funcionario.imposto <= 0);
		
		System.out.println("O salário líquido do funcionário é de R$ "+  funcionario.salarioLiquido());
		int aumento;	
		do {
			System.out.print("Informe a porcentagem de aumento do salário:");
			aumento = in.nextInt();
		}while(aumento <= 0);
		
		funcionario.aumentoSalario(aumento);
		in.close();
	}
	
}
