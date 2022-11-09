package br.com.curso.dez;
import java.util.Scanner;

public class MainProduto {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int qtdProdutos;
	String nomeProduto = "";
	double valorProduto;
	double valorTotal = 0 ;
	do {
		System.out.print ("Informe a quantidade de produtos a serem cadastrados: ");
		qtdProdutos = sc.nextInt();
	}while(qtdProdutos <= 0);
	
	Produto[] listaProdutos = new Produto[qtdProdutos];
	for (int i = 0; i < listaProdutos.length; i++) {
		sc.nextLine();
		do {
			System.out.print("Informe o nome do produto: ");
			nomeProduto = sc.nextLine();
		}while(nomeProduto=="");
		
		do {
			System.out.print("Informe o valor do produto: ");
			valorProduto = sc.nextDouble();
		}while(valorProduto <= 0);
	
		Produto produto = new Produto(nomeProduto,valorProduto);
		listaProdutos[i] = produto;
	}
	
	
	for (Produto produto : listaProdutos) {
		valorTotal +=produto.getValor();
	}
	System.out.printf("A média de valores dos produtos é de R$: %.2f", valorTotal/listaProdutos.length);
	
	
	
	sc.close();
}
}
