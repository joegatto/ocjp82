package br.com.gatto.chapter4.exercises;

import java.util.stream.IntStream;

/**
 * Exercise 8
 * Explanation:
 */
public class Exercise8 {
	public static void main(String[] args) {
		IntStream is = IntStream.empty();
		is.average();
		is = IntStream.empty();
		is.findAny();
		is = IntStream.empty();
		is.sum();
	}
}
