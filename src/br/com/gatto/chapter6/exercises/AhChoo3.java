package br.com.gatto.chapter6.exercises;

/**
 * Exercise 14
 * Explanation: F. A multi-catch cannot catch both a superclass
 * and subclass. Notice how similar questions can be while testing something
 * that is entirely different.
 */
public class AhChoo3 {
	static class SneezeException extends Exception {

	}

	static class SniffleException extends SneezeException {

	}

	public static void main(String[] args) throws SneezeException {
		// try {
		// throw new SneezeException();
		// } catch (SneezeException | SniffleException e) {
		// throw e;
		// }
	}
}
