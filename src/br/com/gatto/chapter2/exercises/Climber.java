package br.com.gatto.chapter2.exercises;

/**
 * Exercise 12 
 * Explanation: C. The functional interface takes two int
 * parameters. The code on line x1 attempts to use them as if one is an Object,
 * resulting in a compiler error making C the correct answer. It also tries to
 * return String even though the data type for the functional interface method
 * is boolean. It is tricky to use types in a lambda when they are implicitly
 * specified. Remember to check the interface for the real type.
 */
public class Climber {
	public static void main(String[] args) {
		// check((h,l) -> h.toString, 5);
	}

	private static void check(Climbable climb, int height) {
		if (climb.isTooHigh(height, 10))
			System.out.println("too high");
		else
			System.out.println("ok");
	}
}
