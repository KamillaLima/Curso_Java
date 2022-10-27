package br.com.curso.oito;

public class Sessenta_nove_ex1 {
public double altura;
public double largura;


public double area() {
	return altura*largura;
}

public double perimetro() {
	return (2*altura) + (2*largura);
}

public double diagonal() {
	return Math.sqrt(Math.pow(largura, 2) + Math.pow(altura, 2));
}

public String toString() {
	return "A área é de =" + area()+
			"\nO perímetro é de ="+perimetro()+
			"\nA diagonal é de ="+String.format("%.3f", diagonal());
}
}
