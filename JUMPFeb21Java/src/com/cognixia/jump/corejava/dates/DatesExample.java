package com.cognixia.jump.corejava.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DatesExample {

	public static void main(String[] args) {
		
		getLocalDateTime();
		
		zonedDateTime();

	}
	
	public static void getLocalDateTime() {
		LocalDate july3 = LocalDate.of(2020, 7, 3);
		ZoneId europe = ZoneId.of("Europe/Paris");
		LocalDate today = LocalDate.now(europe);
		
		System.out.println(july3);
		System.out.println(today);
		
		System.out.println(today.plusDays(50));
	}
	
	public static void zonedDateTime() {
		LocalDateTime ldt = LocalDateTime.of(2016, 7, 3, 8, 45);
		ZonedDateTime zdt;
		
		ZoneId id = ZoneId.of("Europe/Paris");
		zdt = ZonedDateTime.of(ldt, id);
		System.out.println(zdt);
		
		System.out.println(zdt.getHour());
		System.out.println(ZonedDateTime.now().getSecond());
		
	}

}
