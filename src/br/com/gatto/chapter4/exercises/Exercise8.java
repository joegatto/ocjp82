package br.com.gatto.chapter4.exercises;

import java.util.stream.IntStream;

/**
 * Exercise 8 
 * Explanation: D, E. The sum() method returns an int rather than an
 * OptionalInt because the sum of an empty list is zero. Therefore, option E is
 * correct. The findAny() method returns an OptionalInt because there might not
 * be any elements to find. Therefore, option D is correct. The average() method
 * returns an OptionalDouble since averages of any type can result in a
 * fraction. Therefore, options A and B are both incorrect.
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
