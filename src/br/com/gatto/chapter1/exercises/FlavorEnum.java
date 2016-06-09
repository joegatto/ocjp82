package br.com.gatto.chapter1.exercises;

/**
 * Exercise 6
 * Explanation:
 */
public class FlavorEnum {
	enum Flavors {
		VANILLA, CHOCOLATE, STRAWBERRY
	}

	public static void main(String[] args) {
		System.out.println(Flavors.CHOCOLATE.ordinal());
	}
}
