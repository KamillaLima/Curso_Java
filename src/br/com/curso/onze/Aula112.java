package br.com.curso.onze;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Aula112 {
public static void main(String[] args) {
	Instant d1 = Instant.parse("2002-04-21T12:30:00Z");
	/*Peguei uma data global e transformei para local,usando o fuso horário de portugal*/
	LocalDateTime formato = LocalDateTime.ofInstant(d1, ZoneId.of("Portugal"));
	LocalDateTime formato2= LocalDateTime.ofInstant(d1, ZoneId.systemDefault());
	//aqui já peguei o fuso horário do próprio pc
	System.out.println(formato);
	System.out.println(formato2);
	
	
	/*Usando o get em um localdate e localDateTime consigo puxar algumas informações específicas sobre aquela data*/
	LocalDate d2 = LocalDate.parse("2022-12-18");
	System.out.println(d2.getDayOfMonth());
	System.out.println(d2.getYear());
	
	LocalDateTime d3 = LocalDateTime.parse("2019-04-11T15:40");
	System.out.println(d3.getMonthValue());
	System.out.println(d3.getHour());
}
}
