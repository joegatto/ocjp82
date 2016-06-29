package br.com.gatto.chapter4.exercises;

import java.util.stream.Stream;

/**
 * Exercise 6 
 * Explanation: A. Options C and D are incorrect because these
 * methods do not take a Predicate parameter and do not return a boolean.
 * Options B and E are incorrect because they cause the code to run infinitely.
 * The stream has no way to know that a match won’t show up later. Option A is
 * correct because it is safe to return false as soon as one element passes
 * through the stream that doesn’t match.
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
