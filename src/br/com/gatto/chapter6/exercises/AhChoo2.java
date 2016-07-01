package br.com.gatto.chapter6.exercises;

/**
 * Exercise 13 
 * Explanation: A. Since a multi-catch is used, the variable in
 * the catch block is effectively final and cannot be reassigned.
 */
public class AhChoo2 {
	static class SneezeException extends Exception {

	}

	static class SniffleException extends SneezeException {

	}

	public static void main(String[] args) throws SneezeException {
		try {
			throw new SneezeException();
		} catch (SneezeException | RuntimeException e) {
			throw e;
		}
	}
}
