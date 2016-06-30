package br.com.gatto.chapter5.exercises;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Exercise 4 
 * Explanation: Java will first look for the most specific matches
 * it can find, starting with Dolphins_en_US.java and then
 * Dolphins_en_US.properties. Since neither is found, it drops the country and
 * looks for Dolphins_en.java. Since a match is found, there is no reason to go
 * on to the next one, which is Dolphins_en.properties.
 */
public class Exercise4 {
	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		ResourceBundle b = ResourceBundle.getBundle("Dolphins");
		System.out.println(b.getString("name"));
	}
}
