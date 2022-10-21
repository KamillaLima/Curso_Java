package br.com.curso.cinco;

public class Trinta_nove {
	public static void main(String[] args) {
		String nome;
		if (10 < 3) {
			nome = "MARIA";
		} else {
			nome = "JOSE";
		}
		
		
		String nomeSegundo = (10<3)?"MARIA" :  "JOSE";
		System.out.println(nomeSegundo);
		
		String nomeSegundoTeste = (10>3)?"MARIA":"JOSE";
		System.out.println(nomeSegundoTeste);

	}

	// O jeito acima é o que estamos acostumados a fazer,porém fica um comando bem
	// grande,certo?
	// Uma segunda opção é :

	
}
