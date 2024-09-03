import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class TesteDateTime {

	public static void main(String[] args) {

		DateTimeFormatter form1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter form2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter form3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter form4 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter form5 = DateTimeFormatter.ISO_INSTANT;
		
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2024-07-22");
		LocalDateTime d05 = LocalDateTime.parse("2024-07-22T22:04:23");
		Instant d06 = Instant.parse("2024-07-22T01:04:23Z");
		
		LocalDate d07 = LocalDate.parse("11/07/2004", form1);
		LocalDateTime d08 = LocalDateTime.parse("11/07/2004 11:20", form2);
		
		System.out.println("d01 = " + d01.format(form1));
		System.out.println("d02 = " + d02.format(form3));
		System.out.println("d03 = " + form3.format(d03));
		System.out.println("d04 = " + d04.format(form1));
		System.out.println("d05 = " + d05.format(form2));
		System.out.println("d06 = " + form3.format(d06));
		System.out.println("d07 = " + d07.format(form1));
		System.out.println("d07 = " + form1.format(d05));
		System.out.println("d08 = " + d08.format(form2));
		System.out.println("d08 = " + form4.format(d08));
		System.out.println("d06 = " + form5.format(d06));
		System.out.println("d06 = " + d06.toString());
		
		System.out.println("==================================");
		LocalDate r1 = LocalDate.ofInstant(d06,ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
		
		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		System.out.println("r3 = " + r3);
		System.out.println("r4 = " + r4);
		System.out.println("Dia = " + d04.getDayOfMonth());
		System.out.println("Mes = " + d04.getMonthValue());
		System.out.println("Ano = " + d04.getYear());
		System.out.println("Horas = " + d05.getHour());
		System.out.println("Minutos = "+ d05.getMinute());
		System.out.println("Dia da semana = " + d05.getDayOfWeek());
		
		System.out.println("==================================");
		LocalDate semanaPassadaLocalDate = d04.minusDays(7);
		LocalDate semanaQueVemLocalDate = d04.plusDays(7);
		
		System.out.println("semanaPassadaLocalDate = " + semanaPassadaLocalDate);
		System.out.println("semanaQueVemLocalDate = " + semanaQueVemLocalDate);
		
		System.out.println();
		LocalDateTime semanaPassadaLocalDateTime = d05.minusDays(7);
		LocalDateTime semanaQueVemLocalDateTime = d05.plusDays(7);
		
		System.out.println("semanaPassadaLocalDateTime = " + semanaPassadaLocalDateTime);
		System.out.println("semanaQueVemLocalDateTime = " + semanaQueVemLocalDateTime);
		
		System.out.println();
		Instant semanaPassadaInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant semanaQueVemInstant = d06.plus(7, ChronoUnit.DAYS);
		
		System.out.println("semanaPassadaInstant = " + semanaPassadaInstant);
		System.out.println("semanaQueVemInstant = " + semanaQueVemInstant);
		
		Duration tempo1 = Duration.between(semanaPassadaInstant, semanaQueVemInstant);
		System.out.println("tempo1 dias = "+ tempo1.toDays());
		System.out.println("Tempo1 horas = "+ tempo1.toHours());
		
		Duration tempo2 = Duration.between(semanaQueVemInstant, semanaPassadaInstant);
		System.out.print("tempo2 = " + tempo2.toDays());
		
	}

}
