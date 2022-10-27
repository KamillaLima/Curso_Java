package br.com.curso.oito;

public class Sessenta_seis {
public String nome;
public double preco;
public int quantidade;

public double valorEmestoque() { 
	return preco * quantidade;
}

public void adicionarEmEstoque(int quantidade) {
	this.quantidade = this.quantidade + quantidade;
	
	/* o this.quantidade fala que eu quero pegar exatamente o atributo quantidade,é colocado esse this pra nao confundir 
	 * com o parametro quantidade que tem o mesmo nome 
	 * this.quantidade = quantidade que ja tem no estoque
	 * quantidade = quantidade a ser adicionada no estoque
	 */
}

public void removerProduto(int quantidade) {
	this.quantidade -= quantidade;
	
}

@Override
public String toString() {
	return "Produto : Nome= " + nome +
			",preço =  R$" + String.format("%.2f",preco) +  // o String.format("%.2f",preco) é uma outra forma de formatar o meu preço
			", quantidade em estoque=" + quantidade +
			" total em estoque= R$"+valorEmestoque(); 
								// o toString também permite adicionar o método e não apenas os atributos a serem printados	
}


}
