package br.com.gatto.chapter5.exercises;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Exercise 7 
 * Explanation: D. A LocalDate does not have a time element.
 * Therefore, it has no method to add hours, and the code does not compile.
 */
public class Exercise7 {
	public static void main(String[] args) {
		LocalDate date = LocalDate.parse("2018-04-30", DateTimeFormatter.ISO_LOCAL_DATE);
		date.plusDays(2);
		// date.plusHours(3);
		System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());
	}
}
