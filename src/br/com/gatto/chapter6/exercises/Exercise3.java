package br.com.gatto.chapter6.exercises;

import java.io.IOException;

/**
 * Exercise 3 
 * Explanation: E. Options B, D, and F are incorrect because only
 * one variable name is allowed in a multi-catch block. Option A is incorrect
 * because FileNotFoundException is a subclass of IOException. A multi-catch
 * statement does not allow redundancy, and just catching IOException would have
 * been equivalent. Option C is incorrect because the IOException that is thrown
 * is not handled.
 */
public class Exercise3 {
	public static void main(String[] args) {
		try {
			throw new IOException();
		} catch (IOException | RuntimeException e) {
		}
	}
}
