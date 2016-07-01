package br.com.gatto.chapter6.exercises;


/**
 * Exercises 9 
 * Explanation: A, D. An assertion consists of a boolean expression
 * followed by an optional colon and message. The boolean expression is allowed
 * to be in parenthesis, but this is not required. Therefore A and D are
 * correct.
 */
public class OhNoTest {
	public static void main(String[] args) {
		int n = 0;
		assert n < 0 : "OhNo";
		// assert n < 0 , "OhNo";
		// assert n < 0 ("OhNo");
		assert (n < 0) : "OhNo";
		// assert(n < 0, "OhNo");
	}
}
