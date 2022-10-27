package br.com.curso.oito;

public class Sessenta_nove_ex2 {
public String nome;
public double salarioBruto;
public double imposto;

public String toString() {
	return "Nome: "+ nome + ", R$"+salarioBruto;
}


public double salarioLiquido() {
	return salarioBruto - imposto;
}

public void aumentoSalario(int porcentagem) {
	double aumento =  ((salarioBruto * porcentagem)/100)+ salarioLiquido();
	System.out.printf(nome +" ,salário atualizado R$ %.2f",aumento);
}
}
