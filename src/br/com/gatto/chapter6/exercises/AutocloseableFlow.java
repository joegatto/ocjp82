package br.com.gatto.chapter6.exercises;

import java.io.*;


/**
 * Exercise 5 
 * Explanation: C. After opening both resources in the
 * try-with-resources statement, T is printed. Then the try-with-resource
 * completes and closes the resources in reverse order from which they were
 * opened. After W is printed, an exception is thrown. However, the remaining
 * resource is still closed and D is printed. The exception thrown is then
 * caught and E is printed. Last, the finally block is run, printing F.
 * Therefore the answer is TWDEF.
 */
public class AutocloseableFlow {
	static class Door implements AutoCloseable {
		@Override
		public void close() {
			System.out.print("D");
		}
	}

	static class Window implements Closeable {
		@Override
		public void close() {
			System.out.print("W");
			throw new RuntimeException();
		}
	}

	public static void main(String[] args) {
		try (Door d = new Door(); Window w = new Window()) {
			System.out.print("T");
		} catch (Exception e) {
			System.out.print("E");
		} finally {
			System.out.print("F");
		}
	}
}