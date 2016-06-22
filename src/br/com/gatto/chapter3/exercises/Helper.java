package br.com.gatto.chapter3.exercises;

import java.io.FileNotFoundException;

/**
 * Exercise 12 
 * Explanation: A, B, D. The generic type must be Exception or a
 * subclass of Exception since this is an upper bound. C and E are wrong because
 * Throwable is a superclass of Exception. D uses an odd syntax by explicitly
 * listing the type, but you should be able to recognize it as acceptable.
 */
public class Helper {
	public static <U extends Exception> void printException(U u) {
		System.out.println(u.getMessage());
	}

	public static void main(String[] args) {
		Helper.printException(new FileNotFoundException("A"));
		Helper.printException(new Exception("B"));
		// Helper.<Throwable>printException(new Exception("C"));
		Helper.<NullPointerException> printException(new NullPointerException("D"));
//		Helper.printException(new Throwable("E"));
	}
}
