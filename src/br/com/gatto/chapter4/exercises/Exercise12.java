package br.com.gatto.chapter4.exercises;

import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

/**
 * Exercise 12
 * Explanation:
 */
public class Exercise12 {
	public static void main(String[] args) {
		Supplier<String> x = String::new;
		BiConsumer<String, String> y = (a, b) -> System.out.println();
		UnaryOperator<String> z = a -> a + a;
	}
}
