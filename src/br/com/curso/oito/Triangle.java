package br.com.curso.oito;

public class Triangle {
private double bLado;
private double c;


public Triangle(double bLado, double c) {
	super();
	this.bLado = bLado;
	this.c = c;
}


public Triangle() {
	super();
}


public double getbLado() {
	return bLado;
}


public void setbLado(double bLado) {
	this.bLado = bLado;
}


public double getC() {
	return c;
}


public void setC(double c) {
	this.c = c;
}


public void calcular() {
	if (bLado>c) {
		System.out.println("o maior valor é b");
	}else {
		System.out.println("o maior valor é c");
	}
}

}
