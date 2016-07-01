package br.com.gatto.chapter6.exercises;

/**
 * Exercise 10 
 * Explanation: A, E. Line 5 does not compile because assert is
 * a reserved word making Choice A correct. B and C are incorrect because the
 * parenthesis and message are both optional. D is incorrect because assertions
 * should not have side effects. E is correct because checking an argument
 * passed from elsewhere in the program is an appropriate use of an assertion.
 */
public class Exercise10 {
	private int addPlusOne(int a, int b) {
//		boolean assert = false;
		assert a++ > 0;
		assert b > 0;
		return a + b;
	}
}
