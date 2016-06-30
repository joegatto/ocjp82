package br.com.gatto.chapter5.exercises;

import java.time.LocalDate;
import java.time.Month;

/**
 * Exercise 8 
 * Explanation: F. Java throws an exception if invalid date values
 * are passed. There is no 40th day in April—or any other month for that
 * matter.
 */
public class Exercise8 {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2018, Month.APRIL, 40);
		System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());
	}
}
