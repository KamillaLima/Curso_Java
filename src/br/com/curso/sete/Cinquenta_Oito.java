package br.com.curso.sete;

public class Cinquenta_Oito {
	public static void main(String[] args) {
		
		String frase = "ola mundo java      ";
		//System.out.println(frase.toUpperCase());
		//System.out.println(frase.toLowerCase());
		System.out.println(frase.trim());
		//remove espaços do inincio e do fim da frase
		
		
		System.out.println(frase.substring(0,8));
		//irá pegar os caracteres a partir do indice 0 até o indice 6
		
		System.out.println(frase.replace(" ", "--"));
		
		System.out.println(frase.indexOf("a"));
		//qual a primeira posição em que aparece a letra a
		
		System.out.println(frase.lastIndexOf("a"));
		//qual a última posição em que aparece a letra a 
		

		String array[] = frase.split(" ");
		for (String string : array) {
			System.out.println(string);
		}
		//recorta a String
		
		/*comentário de bloco */  
		// comentario de linha
	}

}
