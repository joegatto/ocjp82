package br.com.gatto.chapter4.exercises;

import java.util.stream.Stream;

/**
 * Exercise 6
 * Explanation:
 */
public class Exercise6 {
	public static void main(String[] args) {
		Stream<String> s = Stream.generate(() -> "meow");
		System.out.println(s.allMatch(String::isEmpty)); // OK
		// System.out.println(s.anyMatch(String::isEmpty)); // NOK
		// System.out.println(s.findAny(String::isEmpty)); // NOK
		// System.out.println(s.findFirst(String::isEmpty)); //NOK
		// System.out.println(s.noneMatch(String::isEmpty)); // NOK
	}
}
