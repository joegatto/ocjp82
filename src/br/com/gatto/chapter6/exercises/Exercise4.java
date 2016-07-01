package br.com.gatto.chapter6.exercises;

/**
 * Exercise 4
 * Explanation: A, B. A try-with-resources statement does not
 * require a catch or finally block. A traditional try statement requires at
 * least one of the two.
 */
public class Exercise4 {
	public static void main(String[] args) throws Exception {
		try {

		} finally {

		}

		try {
			System.out.println(1);
		} catch (Exception e) {

		}

		try (StuckTurkeyCage t = new StuckTurkeyCage()) {
			System.out.println(t);
		}
	}
}
