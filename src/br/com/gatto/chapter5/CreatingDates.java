package br.com.gatto.chapter5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class CreatingDates {
	public static void main(String[] args) {
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		System.out.println(ZonedDateTime.now());

		LocalDate d1 = LocalDate.of(2015, Month.JANUARY, 20);
		LocalDate d2 = LocalDate.of(2015, 1, 20);

		Month month = Month.JANUARY;
		// boolean b1 = month == 1;
		boolean b2 = month == Month.APRIL;

		LocalTime t1 = LocalTime.of(6, 15);
		LocalTime t2 = LocalTime.of(6, 15, 30);
		LocalTime t3 = LocalTime.of(6, 15, 30, 200);

		LocalDateTime dt1 = LocalDateTime.of(d1, t1);
		LocalDateTime dt2 = LocalDateTime.of(2016, 06, 29, 14, 14);
		LocalDateTime dt3 = LocalDateTime.of(2016, Month.JUNE, 29, 14, 14);
		LocalDateTime dt4 = LocalDateTime.of(2016, 06, 29, 14, 14, 59);
		LocalDateTime dt5 = LocalDateTime.of(2016, Month.JUNE, 29, 14, 14, 59);
		LocalDateTime dt6 = LocalDateTime.of(2016, 06, 29, 14, 14, 58, 200);
		LocalDateTime dt7 = LocalDateTime.of(2016, Month.JUNE, 29, 14, 14, 58, 200);

		ZoneId zid = ZoneId.of("US/Eastern");
		ZonedDateTime zdt1 = ZonedDateTime.of(dt1, zid);
		ZonedDateTime zdt2 = ZonedDateTime.of(d1, t1, zid);
		ZonedDateTime zdt3 = ZonedDateTime.of(2016, 06, 29, 14, 17, 59, 200, zid);

		System.out.println(ZoneId.systemDefault());
		ZoneId.getAvailableZoneIds().stream().filter(z -> z.contains("US") || z.contains("America")).sorted()
				.forEach(System.out::println);

		LocalDate date = LocalDate.of(2016, 06, 29);
		System.out.println(date);
		date = date.plusDays(2);
		System.out.println(date);
		date = date.plusWeeks(1);
		System.out.println(date);
		date = date.plusMonths(1);
		System.out.println(date);
		date = date.plusYears(5);
		System.out.println(date);

		LocalTime time = LocalTime.of(5, 15);
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		System.out.println(dateTime);
		dateTime = dateTime.minusDays(1);
		System.out.println(dateTime);
		dateTime = dateTime.minusMonths(2);
		System.out.println(dateTime);
		dateTime = dateTime.minusYears(4);
		System.out.println(dateTime);
		dateTime = dateTime.minusHours(10);
		System.out.println(dateTime);
		dateTime = dateTime.minusMinutes(10);
		System.out.println(dateTime);
		dateTime = dateTime.minusSeconds(10);
		System.out.println(dateTime);
		dateTime = dateTime.minusNanos(10);
		System.out.println(dateTime);
	}
}
