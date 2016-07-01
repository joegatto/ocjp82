package br.com.gatto.chapter6.exercises;

/**
 * Exercise 7 
 * Explanation: C. The code compiles fine, so option E is incorrect.
 * The command line has only two arguments, so args.length is 2 and the if
 * statement is true. However, because assertions are not enabled, it does not
 * throw an AssertionError, so option B is incorrect. The println attempts to
 * print args[2], which generates an ArrayIndexOutOfBoundsException, so the
 * answer is option C.
 */
public class EchoInput {
	public static void main(String[] args) {
		if (args.length <= 3)
			assert false;
		System.out.println(args[0] + args[1] + args[2]);
	}
}
