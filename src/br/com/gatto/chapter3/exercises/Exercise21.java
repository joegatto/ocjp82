package br.com.gatto.chapter3.exercises;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Exercise 21 
 * Explanation: A, F. You have to memorize this. hasNext()
 * returns a boolean, and it is used in the loop. next() returns the next
 * element.
 */
public class Exercise21 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("1", "2", "3");
		Iterator iter = list.iterator();
		while (iter.hasNext()) {
			System.out.print(iter.next());

		}
	}
}
