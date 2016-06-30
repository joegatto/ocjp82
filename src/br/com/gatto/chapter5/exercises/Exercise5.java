package br.com.gatto.chapter5.exercises;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Exercise 5 
 * Explanation: D. Java will use Dolphins_fr.properties as the
 * matching resource bundle on line 7 because it is an exact match on the
 * language of the requested locale. Line 8 finds a matching key in this file.
 * Line 9 does not find a match in that file, and therefore it has to look
 * higher up in the hierarchy. Once a bundle is chosen, only resources in that
 * hierarchy are allowed.
 */
public class Exercise5 {
	public static void main(String[] args) {
		Locale fr = new Locale("fr");
		Locale.setDefault(new Locale("en", "US"));
		ResourceBundle b = ResourceBundle.getBundle("Dolphins", fr);
		System.out.println(b.getString("name"));
		System.out.println(b.getString("age"));
	}
}
