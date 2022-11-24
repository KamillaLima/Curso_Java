package br.com.curso.dez;

import java.util.ArrayList;
import java.util.List;

public class Unboxing_AutoBoxing_Unboxing_Wrapper {
	public static void main(String[] args) {
		
		//boxing
		int x = 3;
		Object obj = x;
		
		//unboxing
		int valorConvertido = (int) obj;
		System.out.println(valorConvertido);
		
		//wrapper 
		int X = 2;
		Integer inte = x;
		int valorConvertidoWrapper = inte;
		System.out.println(valorConvertidoWrapper);
		//não precisei fazer o casting,pq o tipo Integer já se relaciona com o int
		

		Integer valorTeste2 = 12;
		System.out.println(Double.valueOf(valorTeste2));
		

		 
}
}