package br.com.gatto.chapter6.exercises;


/**
 * Exercise 8 
 * Explanation: B, C. Java uses the flags –ea or –enableassertions
 * to turn on assertions. –da or –disableassertions turns off assertions. The
 * colon indicates for a specific class. Choice B is correct because it turns on
 * assertions for all code. Choice C is correct because it disables assertions
 * but then turns them back on for this class.
 */
public class On {
	public static void main(String[] args) {
		String s = null;
		assert s != null;
	}
}
