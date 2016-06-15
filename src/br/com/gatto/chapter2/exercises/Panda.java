package br.com.gatto.chapter2.exercises;

import java.util.function.Predicate;

/**
 * Exercise 6 
 * Explanation: A. This code compiles and runs without issue so C, D,
 * E, and F are incorrect. Line h1 creates a lambda expression that checks if
 * the age is less than 5. Since there is only one parameter and it does not
 * specify a type, the parentheses around the type parameter are optional. Line
 * h2 uses the Predicate interface, which declares a test() method. Since test()
 * returns true on the expression, match is output and A is correct.
 *
 */
public class Panda {
	int age;

	public static void main(String[] args) {
		Panda p1 = new Panda();
		p1.age = 1;
		check(p1, p -> p.age < 5);
	}

	private static void check(Panda panda, Predicate<Panda> pred) {
		String result = pred.test(panda) ? "match" : "not match";
		System.out.println(result);
	}
}
