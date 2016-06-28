package br.com.gatto.chapter4.exercises;

import java.util.stream.Stream;

/**
 * Exercises 1
 * Explanation: 
 */
public class Exercise1 {
	public static void main(String[] args) {
		Stream<String> stream = Stream.iterate("", (s) -> s + "1");
		System.out.println(stream.limit(2).map(x -> x + "2"));
	}
}
