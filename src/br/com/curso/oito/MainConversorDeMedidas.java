package br.com.curso.oito;

import java.util.Scanner;

public class MainConversorDeMedidas {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double valorDolar;
		double valorReal;
		int imposto;
		do {
			System.out.print("Informe o valor do dólar: U$");
			valorDolar = sc.nextDouble();
		} while (valorDolar <= 0);
		
		do {
			System.out.print("Informe o valor que você gostaria de trocar: R$");
			valorReal = sc.nextDouble();
		}while(valorReal <= 0);
		
		do {
			System.out.print("Informe o valor do imposto:");
			imposto = sc.nextInt();
		}while(imposto <= 0 );
		double valorConvertido = ConversorDeMedidas.converterDolar(valorDolar, valorReal, imposto);
		/*Com um método sendo estático eu não tenho a necessidade de instanciar um objeto para poder utilizá-lo,
		 * nesse caso por exemplo eu não precisei fazer valorConvertido valorConvertido = new valorConvertido();
		 * Apenas chamei o método converterDolar,justamente por ele ser estático.
		 * Métodos estáticos também são utilizado no Math,já que eu também não preciso instancia-lo para conseguir utilizar
		 * Métodos estáticos fazem mais sentidos quando estão em classes sem atributos,como essa classe ConversorDeMedidas*/
		System.out.printf("O valor convertido é de U$%.2f",valorConvertido);
		
		sc.close();
	}
}
