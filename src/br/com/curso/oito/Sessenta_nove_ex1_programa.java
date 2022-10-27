package br.com.curso.oito;

import java.util.Scanner;

public class Sessenta_nove_ex1_programa {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	Sessenta_nove_ex1 retangulo = new Sessenta_nove_ex1();
	do {
		System.out.print("Informe a largura: ");
		retangulo.largura = in.nextDouble();
	}while(retangulo.largura <= 0);
	
	do {
		System.out.print("Informe a altura: ");
		retangulo.altura = in.nextDouble();
	}while(retangulo.altura <= 0);
	
	System.out.println(retangulo);
	in.close();
}
}
