package br.com.gatto.chapter5.exercises;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * Exercise 14
 * Explanation: A, C, D. Option B is incorrect because there is no
 * March 40 th. Option E is incorrect because 2017 isn’t a leap year and
 * therefore has no February 29 th. Option D is correct because it is just a
 * regular date and has nothing to do with daylight savings time. Options A and
 * C are correct because Java is smart enough to adjust for daylight savings
 * time.
 */
public class Exercise14 {
	public static void main(String[] args) {
		ZoneId zone = ZoneId.of("US/Eastern");
		// LocalDate date = LocalDate.of(2016, 3, 13); // NO EXCEPTION
		// LocalDate date = LocalDate.of(2016, 3, 40); // THROW EXCEPTION
		 LocalDate date = LocalDate.of(2016, 11, 6); // NO EXCEPTION
		// LocalDate date = LocalDate.of(2016, 11, 7); // NO EXCEPTION
		// LocalDate date = LocalDate.of(2017, 2, 29); // THROW EXCEPTION
		LocalTime time = LocalTime.of(2, 15);
		ZonedDateTime a = ZonedDateTime.of(date, time, zone);
	}
}
