package br.com.gatto.chapter6.exercises;

/**
 * Exercise 12 
 * Explanation: A, D, E. Since a single exception type is
 * caught, only the same type of exception or a subclass is allowed to be
 * assigned to the variable in the catch block. Therefore D and E are correct.
 * Additionally A is correct because there are no changes to the variable.
 */
public class AhChoo {
	static class SneezeException extends Exception {

	}

	static class SniffleException extends SneezeException {

	}

	public static void main(String[] args) throws SneezeException {
		try {
			throw new SneezeException();
		} catch (SneezeException e) {
			e = new SniffleException();
			throw e;
		}
	}
}
