package br.com.gatto.chapter3.exercises;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Exercise 7 
 * Explanation: A, D. The code compiles fine. It uses the diamond
 * operator, and it allows any implementation of Number to be added. HashSet
 * does not guarantee any iteration order, making A and D correct.
 */
public class Exercise7 {
	public static void main(String[] args) {
		Set<Number> numbers = new HashSet<>();
		numbers.add(new Integer(86));
		numbers.add(75);
		numbers.add(new Integer(86));
		numbers.add(null);
		numbers.add(309L);
		Iterator iter = numbers.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
