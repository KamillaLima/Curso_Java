package br.com.curso.onze;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class InstanciarDatas {

	public static void main(String[] args) {
		// data atual
		LocalDate dataAgora = LocalDate.now();
		// data e hora atual
		LocalDateTime datahoraAgora = LocalDateTime.now();
		System.out.println(dataAgora);
		System.out.println(datahoraAgora);

		// data hora atual de Londres
		Instant datahoraAtual = Instant.now();
		System.out.println(datahoraAtual);

		
		/*TEXTO ISO
		 *  */
		// passando de texto para data
		LocalDate dataTexto = LocalDate.parse("2004-04-22");
		// sempre passar no formato: ano-mes-dia (colocar sempre - entre as datas)
		System.out.println(dataTexto);

		LocalDateTime dataHoraTexto = LocalDateTime.parse("1990-03-26T14:34:22");
		// sempre passar a hora no formato: Hora:minuto:segundo (colocar o T antes da
		// hora!!)
		System.out.println(dataHoraTexto);

		// texto para data-- usando a hora de Londres
		Instant dataHoraTextoZ = Instant.parse("1990-03-26T14:34:22Z");
		System.out.println(dataHoraTextoZ);

		// texto para data -- usar para fuso horário: -03:00 serve para diminuir 3 horas
		// no horário informado
		Instant textoDataHora = Instant.parse("1990-03-26T14:34:22-03:00");
		System.out.println(textoDataHora);
		
		
		
		
		/*FORMATO CUSTOMIZADO*/
		//primeiro eu preciso especificar o formato que a minha data terá
		DateTimeFormatter formatacao = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataFormatada = LocalDate.parse("19/03/2004",formatacao);
		//passo a data e logo em seguida o objeto de formatação que eu criei
		System.out.println(dataFormatada);
		//ele ainda printa no formato ISO ! 
		
		//posso tanto instanciar um objeto para salvar o formato da data,como eu posso já passar direto ela como parametro 
		LocalDateTime formatacaoDataHora = LocalDateTime.parse("08/12/2011 19:30", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		System.out.println(formatacaoDataHora);
		
		
		
		
		LocalDate dataSeparada = LocalDate.of(2000, 11, 23);
		LocalDateTime dataHoraSeparada = LocalDateTime.of(2012, 9, 22, 14, 55);
					
	}

}
