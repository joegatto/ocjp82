package br.com.gatto.chapter5;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class InstantsTests {
	public static void main(String[] args) {
		Instant now = Instant.now();
		// do something time consuming
		Instant later = Instant.now();

		Duration duration = Duration.between(now, later);
		System.out.println(duration.toMillis());

		LocalDate date = LocalDate.of(2015, 5, 25);
		LocalTime time = LocalTime.of(11, 55, 00);
		ZoneId zone = ZoneId.of("US/Eastern");
		ZonedDateTime zonedDateTime = ZonedDateTime.of(date, time, zone);
		Instant instant = zonedDateTime.toInstant();
		System.out.println(zonedDateTime);
		System.out.println(instant);

		Instant i = Instant.ofEpochSecond(1467229960);
		System.out.println(i);
		Instant nextDay = instant.plus(1, ChronoUnit.DAYS);
		System.out.println(nextDay);
		Instant nextHour = instant.plus(1, ChronoUnit.HOURS);
		System.out.println(nextHour);
		Instant nextWeek = instant.plus(1, ChronoUnit.WEEKS);
		System.out.println(nextWeek);
	}
}
