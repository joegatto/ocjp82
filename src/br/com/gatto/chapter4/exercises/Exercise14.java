package br.com.gatto.chapter4.exercises;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Exercise 14 
 * Explanation: D. Line 4 should obviously look OK. It creates a
 * Stream and uses autoboxing to put the Integer 1 inside. Line 5 converts to a
 * primitive, again using autoboxing. Line 6 converts to a double primitive,
 * which works since double d = 1; would work. Line 7 is where it all falls
 * apart. Converting from a double to an int would require a cast inside the
 * lambda.
 */
public class Exercise14 {
	public static void main(String[] args) {
		Stream<Integer> s = Stream.of(1);
		IntStream is = s.mapToInt(x -> x);
		DoubleStream ds = s.mapToDouble(x -> x);
		// Stream<Integer> s2 = ds.mapToInt(x -> x);
		// s2.forEach(System.out::println);
	}
}
