package br.com.gatto.chapter4.exercises;

import java.util.function.Function;
import java.util.function.UnaryOperator;

/**
 * Exercise 17 
 * Explanation: E. A UnaryOperator is a special type of function
 * where the parameter and return type are the same. Therefore, option E is
 * correct. Notice that other options don’t even compile because they have the
 * wrong number of generic types for the functional interface provided.
 */
public class Exercise17 {
	public static void main(String[] args) {
		UnaryOperator<Integer> uo = x -> x * x;
		// BiFunction<Integer> bf1 = x -> x * x;
		// BiFunction<Integer, Integer> bf2 = x -> x * x;
		// BinaryOperator<Integer> bu = x -> x * x;
		// Function<Integer> f1 = x -> x * x;
		Function<Integer, Integer> f2 = x -> x * x;
	}
}
