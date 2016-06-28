package br.com.gatto.chapter4.exercises;

import java.util.OptionalLong;
import java.util.stream.LongStream;

/**
 * Exercise 9
 * Explanation:
 */
public class Exercise9 {
	public static void main(String[] args) {
		LongStream ls = LongStream.of(1, 2, 3);
		OptionalLong opt = ls.map(n -> n * 10).filter(n -> n < 5).findFirst();
		opt.ifPresent(System.out::println);
		if (opt.isPresent())
			System.out.println(opt.getAsLong());
	}
}
