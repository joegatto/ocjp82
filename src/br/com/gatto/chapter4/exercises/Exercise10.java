package br.com.gatto.chapter4.exercises;

import java.util.stream.Stream;

/**
 * Exercise 10
 * Explanation:
 */
public class Exercise10 {
	public static void main(String[] args) {
		Stream<String> s = Stream.generate(() -> "1");
		s.limit(10).forEach(System.out::println);
	}
}
