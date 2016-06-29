package br.com.gatto.chapter4.exercises;

import java.util.Arrays;
import java.util.List;

/**
 * Exercise 13
 * Explanation: F. If the map() and flatMap() calls were reversed,
 * choice B would be correct. In this case, the Stream created from the source
 * is of type Stream<List<Integer>>. The Function in map expects an Integer
 * rather than a List<Integer>, so the code does not compile.
 */
public class Exercise13 {
	public static void main(String[] args) {
		List<Integer> l1 = Arrays.asList(1, 2, 3);
		List<Integer> l2 = Arrays.asList(4, 5, 6);
		List<Integer> l3 = Arrays.asList();
//		Stream.of(l1, l2, l3).map(x -> x + 1).flatMap(x -> x.stream()).forEach(System.out::println);
	}
}
