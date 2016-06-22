package br.com.gatto.chapter3.exercises;

import java.util.HashMap;
import java.util.Map;

/**
 * Exercise 11 
 * Explanation: A. Line 3 uses the diamond operator to create
 * the map. Lines 5 and 7 use autoboxing to convert between the int primitive
 * and the Integer wrapper class. The keys map to their squared value. 1 maps to
 * 1, 2 maps to 4, 3 maps to 9, 4 maps to 16, and so on.
 */
public class Exercise11 {
	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<>(10);
		for (int i = 1; i <= 10; i++) {
			map.put(i, i * i);
		}
		System.out.println(map.get(4));
	}
}
