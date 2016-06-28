package br.com.gatto.chapter4.exercises;

import java.util.Arrays;
import java.util.List;

/**
 * Exercise 13
 * Explanation:
 */
public class Exercise13 {
	public static void main(String[] args) {
		List<Integer> l1 = Arrays.asList(1, 2, 3);
		List<Integer> l2 = Arrays.asList(4, 5, 6);
		List<Integer> l3 = Arrays.asList();
//		Stream.of(l1, l2, l3).map(x -> x + 1).flatMap(x -> x.stream()).forEach(System.out::println);
	}
}
