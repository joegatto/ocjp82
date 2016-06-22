package br.com.gatto.chapter3.exercises;

/**
 * Exercise 22
 * Explanation: B. When using generic types in a static method, the
 * generic specification goes before the return type.
 */
public class Exercise22 {
	public static <T> T identity(T t) {
		return t;
	}
}
