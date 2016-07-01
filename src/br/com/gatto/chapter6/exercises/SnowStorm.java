package br.com.gatto.chapter6.exercises;


/**
 * Exercise 16 
 * Explanation: C. The exception inside the try block becomes
 * the primary exception since it is thrown first. Then two suppressed
 * exceptions are added to it when trying to close the AutoCloseable resources.
 */
public class SnowStorm {
	static class Walk implements AutoCloseable {
		public void close() {
			throw new RuntimeException("snow");
		}
	}

	public static void main(String[] args) {
		try (Walk w1 = new Walk(); Walk w2 = new Walk();) {
			throw new RuntimeException("rain");
		} catch (Exception e) {
			System.out.println(e.getMessage() + " " + e.getSuppressed().length);
		}
	}
}
