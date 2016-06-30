package br.com.gatto.chapter5.exercises;

import java.util.Locale;

/**
 * Exercise 1 
 * Explanation: A, B. Choices E and F are incorrect because a Locale
 * is created using a constructor. The convention is to use lowercase for a
 * language code and uppercase for a country code. The language is mandatory
 * when using a constructor, which makes choices A and B correct.
 */
public class Exercise1 {
	public static void main(String[] args) {
		Locale l1 = new Locale("hi");
		Locale l2 = new Locale("hi", "IN");
		Locale l3 = new Locale("IN"); // Language is mandatory
		Locale l4 = new Locale("IN", "hi"); // Language is mandatory
		// Locale.create("hi"); // There is no method create
		// Locale.create("IN"); // There is no method create
	}
}
