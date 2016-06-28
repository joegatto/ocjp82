package br.com.gatto.chapter4.exercises;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Exercise 11
 * Explanation:
 */
public class Exercise11 {
	public static void main(String[] args) {
		System.out.println(Stream.iterate(1, x -> ++x).limit(5).map(x -> "" + x).collect(Collectors.joining()));
	}
}
