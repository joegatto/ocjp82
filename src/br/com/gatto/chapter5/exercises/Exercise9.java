package br.com.gatto.chapter5.exercises;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Exercise 9 
 * Explanation: B. The date starts out as April 30, 2018. Since
 * dates are immutable and the plus methods have their return values ignored,
 * the result is unchanged. Therefore, Option B is correct.
 */
public class Exercise9 {
	public static void main(String[] args) {
		LocalDate date = LocalDate.parse("2018-04-30", DateTimeFormatter.ISO_LOCAL_DATE);
		date.plusDays(2);
		date.plusYears(3);
		System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());
	}
}
