package br.com.curso.onze;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Aula113 {
	public static void main(String[] args) {
		LocalDateTime d1 = LocalDateTime.parse("2019-04-11T15:40");
		Instant d2 = Instant.parse("2002-04-21T12:30:00Z");
		LocalDate d3 = LocalDate.parse("2022-12-18");

		/*
		 * Criei uma nova variável chamada lastWeek e diminui 3 dias da mesma,usando o
		 * MinusDay, o Plus sempre adiciona
		 */
		/* Por que criei uma nova variavel? Porque no java as datas são imutáveis */
		LocalDate lastWeek = d3.minusDays(3);

		System.out.println(lastWeek.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

		LocalDate nextWeek = d3.plusDays(20);
		System.out.println(nextWeek.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

		LocalDateTime nextMinute = d1.plusMinutes(44);
		LocalDateTime lastMinute = d1.minusMinutes(22);
		System.out.println(nextMinute.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
		System.out.println(lastMinute.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));

		Instant next = d2.plus(11, ChronoUnit.DAYS);
		/*
		 * Já quando vamos aumentar ou diminuir uma data usando Instant é mais
		 * complicado por natureza o instant não oferece diversos métodos como o
		 * localDaate e o localDateTime fornecem (como minusDay,plusMonth então podemos
		 * chamar o minus e passar o que desejamos diminuir (o valor numerico) e en
		 * seguida o ChronoUnit. avisando o que queremos diminuir,se é minuto,dia,hora
		 */

		Instant last = d2.minus(56, ChronoUnit.MINUTES);
		System.out.println(next);
		System.out.println(last);
		
		/*CÁLCULO ENTRE DATAS HORAS*/
		Duration t1 = Duration.between(nextMinute,d1);
		System.out.println(t1.toMinutes());
		
		/*ATENCAO : O DURATION NÃO FUNCIONA PARA LOCALDATE !!!!!!!!!!!!!!!!!!!!!! porque no seu formato ele não possui espaçõ para  hora e minuto*/
		Duration t2 = Duration.between(nextWeek.atStartOfDay(), d3.atTime(0, 0));
		/*Assim consigo usar o duration com o localDate
		 * O que eu fiz?
		 * com o atTime(0,0) ou com o atStartOfDay defini um horário pra esse local date,mesmo que seja apenas 00*/
		/*O que eu fiz foi bsicamente transformar de localdate para localdateTime
		*/
		System.out.println(t2.toDays());
		
		
		Duration t3 = Duration.between(d2, next);
		System.out.println(t3.toDays());
	

	}

}
