package br.com.gatto.chapter4.exercises;

import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

/**
 * Exercise 12 
 * Explanation: A, F, G. Line 6 doesn’t take any parameters, and
 * it returns a String, making it a Supplier. Another clue is that it uses a
 * constructor reference, which should scream Supplier! This makes choice F
 * correct. Line 7 takes two parameters, and it doesn’t return anything making
 * it a BiConsumer. The print statement should also be a clue that we are
 * dealing with a Consumer or BiConsumer. This makes choice A correct. Choices C
 * and D are there to mislead you; these interfaces don’t actually exist.
 * BinaryOperator spells out binary. The other functional interfaces use the
 * prefix Bi. Finally, line 8 takes a single parameter, and it returns the same
 * type, which is a UnaryOperator. Since the types are the same, only one
 * generic is needed, making choice G correct.
 */
public class Exercise12 {
	public static void main(String[] args) {
		Supplier<String> x = String::new;
		BiConsumer<String, String> y = (a, b) -> System.out.println();
		UnaryOperator<String> z = a -> a + a;
	}
}
