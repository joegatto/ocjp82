package br.com.gatto.chapter3.exercises;

import java.util.HashMap;
import java.util.Map;

/**
 * Exercise 9 
 * Explanation: E. Trick question! The Map interface uses put()
 * rather than add() to add elements to the map. If these examples used put(),
 * the answer would be A and C. B is no good because a long cannot be shoved
 * into a Double. D is no good because a char is not the same thing as a String.
 */
public class Exercise9 {
	public static void main(String[] args) {
		Map<String, Double> map = new HashMap<>();
		// map.add("pi", 3.14159);
		// map.add("e", 2L);
		// map.add("pi", new Double(0.0));
		// map.add('x', ne Double(123.4));
	}
}
