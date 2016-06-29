package br.com.gatto.chapter5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class PeriodTests {
	public static void main(String[] args) {
		Period annualy = Period.ofYears(1);
		Period quarterly = Period.ofMonths(3);
		Period everyThreeWeeks = Period.ofWeeks(3);
		Period everyOtherDay = Period.ofDays(2);
		Period everyYearAndWeek = Period.of(1, 0, 7);

		System.out.println(Period.of(1, 2, 3));
		System.out.println(Period.of(1, 0, 3));
		System.out.println(Period.ofWeeks(3));

		LocalDate date = LocalDate.of(2015, 1, 20);
		LocalTime time = LocalTime.of(6, 15);
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		Period period = Period.ofMonths(1);
		System.out.println(date.plus(period));
		System.out.println(dateTime.plus(period));
		System.out.println(time.plus(period));
	}
}
