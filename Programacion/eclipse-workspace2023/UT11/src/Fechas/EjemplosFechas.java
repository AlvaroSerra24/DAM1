package Fechas;

import java.time.*;
import java.time.format.DateTimeFormatter;
public class EjemplosFechas {
	public static void main(String[] args) {
		LocalDate hoy=LocalDate.now();
		System.out.println(hoy);
		LocalTime ahora=LocalTime.now();
		System.out.println(ahora);
		LocalDateTime hoyAhora=LocalDateTime.now();
		System.out.println(hoyAhora);
		LocalDate fecha=LocalDate.of(1999, 6, 22);
		System.out.println(fecha.getMonth());
		System.out.println(fecha.getDayOfYear());
		System.out.println(fecha.getEra());
		
		DateTimeFormatter fechaFormato=DateTimeFormatter.ofPattern("EEEE dd-MMMM-yyyy HH:mm:ss");
		String fechaFinal=hoyAhora.format(fechaFormato);
		System.out.println(fechaFinal);
		
		//if(fecha.isEqual(fecha)) 
		
		
	}
}
