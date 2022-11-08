package br.com.curso.oito;

public class ConversorDeMedidas {

	public static double converterDolar(double valorDolar,double valorReal,int imposto) {
		double valorBruto=(valorDolar * valorReal);
		return (valorBruto * imposto / 100)+valorBruto;
	}
}
