package br.com.curso.oito;

import java.util.Scanner;

public class Sessenta_Seis_Programa {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Sessenta_seis produto = new Sessenta_seis();
		
		
		do {
			System.out.print("Informe o nome do produto: ");
			produto.nome = in.nextLine();
		} while (produto.nome == null);
		
		do {
			System.out.print("Informe o preço do produto: R$");
			produto.preco = in.nextDouble();
		} while (produto.preco <= 0);

		do {
			System.out.print("Informe a quantidade de produto(s): ");
			produto.quantidade = in.nextInt();
		} while (produto.quantidade <= 0);

		int quantidadeExcluir;
	
		do {
			System.out.print("Informe a quantidade de produtos que você gostaria de excluir :");
			quantidadeExcluir = in.nextInt();
		} while (quantidadeExcluir <= 0);
		produto.removerProduto(quantidadeExcluir);

		int adicionarEstoque;
		do {
			System.out.print("Informe a quantidade de produtos a serem adicionados: ");
			adicionarEstoque = in.nextInt();
		} while (adicionarEstoque <= 0);
		produto.adicionarEmEstoque(adicionarEstoque);

		

		System.out.println(produto);
		//tambem posso fazer sysout(produto.toString);
		in.close();
		
		
	}

}
