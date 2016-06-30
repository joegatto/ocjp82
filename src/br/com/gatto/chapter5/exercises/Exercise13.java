package br.com.gatto.chapter5.exercises;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

/**
 * Exercise 13 
 * Explanation: B. dateTime1 is 2016–03–13T01:30–05:00[US/Eastern]
 * and dateTime2 is 2016–03–13T03:30–04:00[US/Eastern]. While the values are two
 * hours apart, the time zone offset changes as well, making it only change from
 * 6:30 GMT to 7:30 GMT.
 */
public class Exercise13 {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2016, Month.MARCH, 13);
		LocalTime time = LocalTime.of(1, 30);
		ZoneId zone = ZoneId.of("US/Eastern");
		ZonedDateTime dateTime1 = ZonedDateTime.of(date, time, zone);
		ZonedDateTime dateTime2 = dateTime1.plus(1, ChronoUnit.HOURS);
		long hours = ChronoUnit.HOURS.between(dateTime1, dateTime2);
		int clock1 = dateTime1.getHour();
		int clock2 = dateTime2.getHour();
		System.out.println(hours + ", " + clock1 + ", " + clock2);
	}
}
