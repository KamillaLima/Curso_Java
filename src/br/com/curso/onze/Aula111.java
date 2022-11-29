package br.com.curso.onze;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Aula111 {

	public static void main(String[] args) {
	LocalDate data = LocalDate.parse("2011-05-12");
	DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	System.out.println(data.format(fmt1));
	//posso chamar dessas duas formas e estará correto
	System.out.println(fmt1.format(data));
	//também posso passar a formatação já direto,ao invés de criar uma variavel pra armazenar
	System.out.println(data.format(DateTimeFormatter.ofPattern("dd--MM--yyyy")));
	
	
	LocalDateTime dataHora = LocalDateTime.parse("1999-03-28T14:50");
	System.out.println(dataHora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
	
	//para imprimir diferente uma data hora global (instant):
	Instant global = Instant.parse("2022-11-11T16:00:12Z");
	DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
	//withZone(ZoneId.SystemDefault() --- isso vai pegar o fuso horário da minha máquina local
	System.out.println(fmt2.format(global));
	
	
	DateTimeFormatter datahora = DateTimeFormatter.ISO_DATE_TIME;
	//também posso pegar algumas formatações ja prontas (no site da oracle)
	System.out.println(datahora.format(dataHora));
	}

}
