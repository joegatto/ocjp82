package br.com.gatto.chapter5.exercises;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;

/**
 * Exercise 6 
 * Explanation: D, F. Options A and B are incorrect because LocalDate
 * does not have a public constructor. Option C is incorrect because months
 * start counting with 1 rather than 0. Option E is incorrect because it uses
 * the old Calendar constants for months, which begin with 0. Options D and F
 * are both correct ways of specifying the desired date.
 */
public class StartOfSummer {
	public static void main(String[] args) {
		// System.out.println(new LocalDate(2014, 5, 21));
		// System.out.println(new LocalDate(2014, 6, 21));
		System.out.println(LocalDate.of(2014, 5, 21)); //Creates a date with the wrong month
		System.out.println(LocalDate.of(2014, 6, 21));
		System.out.println(LocalDate.of(2014, Calendar.JUNE, 21)); //Creates a date with the wrong month
		System.out.println(LocalDate.of(2014, Month.JUNE, 21));
	}
}
