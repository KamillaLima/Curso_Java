package br.com.curso.dez;

import java.util.Scanner;

public class MainNegativos_ex91 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numeros = 0;

		do {
			System.out.print("Informe quantos números serão guardados: ");
			numeros = sc.nextInt();
		} while (numeros <= 0 || numeros>=11);

		int[] valores = new int[numeros];
		for (int i = 0; i < valores.length; i++) {
	
			System.out.print("Informe o " + i + " valor:");
			int valor = sc.nextInt();
			valores[i] = valor;
			

		}
		System.out.println("Números negativos : ");
		for (int i : valores) {
			if(i < 0 ) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}
}
