package br.com.gatto.chapter4.exercises;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Exercise 20 
 * Explanation: B. Both lists and streams have forEach() methods.
 * There is no reason to collect into a list just to loop through it.
 */
public class Exercise20 {
	public static void main(String[] args) {
		List<Integer> l1 = IntStream.range(1, 6).mapToObj(i -> i).collect(Collectors.toList());
		l1.forEach(System.out::println);
		
		IntStream.range(1, 6).forEach(System.out::println);
	}
}
