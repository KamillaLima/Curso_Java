package br.com.curso.quatro;

import java.util.Locale;

public class Vinte_Tres {
	public static void main(String[] args) {
		int idade = 32;
		double salario = 3433.56655;
		String nome = "Maria";
		System.out.printf("%.2f%n", salario);

		// %n é quebra de linha
		// system.out.printf -- para formatar dados do tipo float
		// esse sysout espera 2 parametros,1 formatação que eu quero e o valor/varaivel
		// que deverá ser formatada.
		//"%.2f" -- formatação com 2 casas decimais
		//É válido ressaltar que essa formatação também já aproxima o dado,ex: 34,8766 - 34,9
	
	
		Locale.setDefault(Locale.US);
		//Quando dou o sysout ele aparece no console com o separador sendo uma vírgula,devido ao 
		//meu pc estar formatado para a língua portuguesa,caso eu nao queria que isso aconteça
		//devo chamar o Locale.setDefault(Locale.País que eu quero como padrao)
		//no caso eu coloquei US,que altera de virgula no console para pron=
		System.out.printf("%.2f%n", salario);
		
		
		System.out.printf("RESULTADO = %.2f metros%n", salario);
		//onde está localizado %.2f é que será inserido a nossa variavel preço
		
		
		System.out.printf("%s tem %d anos e ganha %.2f por mês",nome,idade,salario);
		//o %s recebe texto
		// o %d recebe inteiros;
		//Onde eles estão localizados é que serão inseridos os valores das variaveis que foram citadas posteriormente
		
	}
}
