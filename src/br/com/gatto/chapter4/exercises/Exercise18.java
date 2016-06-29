package br.com.gatto.chapter4.exercises;

import java.util.stream.DoubleStream;

/**
 * Exercise 18
 * Explanation: D. The terminal operation is count(). Since there is
 * a terminal operation, the intermediate operations run. The peek() operation
 * comes before the filter, so both numbers are printed. The count happens to be
 * 1 since the other number is filtered. However, the result of the stream
 * pipeline isn’t stored in a variable, and that result is ignored.
 */
public class Exercise18 {
	public static void main(String[] args) {
		DoubleStream s = DoubleStream.of(1.2, 2.4);
		s.peek(System.out::println).filter(x -> x > 2).count();
	}
}
