package br.com.gatto.chapter4.exercises;

import java.util.stream.Stream;

/**
 * Exercise 10 
 * Explanation: F. The terminal operation must be right before the
 * semicolon, which is line M. Remember that forEach() is a terminal operation
 * while peek() is an intermediate operation. This eliminates all but choices C,
 * E, and F. Choice E is incorrect because there is no limit() operation, which
 * means that the code would run infinitely. Choice C is incorrect because
 * filter() is called before limit(). No elements make it through the filter, so
 * the code also runs infinitely. Choice F is correct.
 */
public class Exercise10 {
	public static void main(String[] args) {
		Stream<String> s = Stream.generate(() -> "1");
		s.limit(10).forEach(System.out::println);
	}
}
