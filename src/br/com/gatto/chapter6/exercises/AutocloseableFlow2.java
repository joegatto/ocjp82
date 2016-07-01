package br.com.gatto.chapter6.exercises;

import java.io.*;

/**
 * Exercise 6 
 * Explanation: G. A try-with-resources statement uses parentheses
 * rather than brackets for the try section. This is likely subtler than a
 * question that you’ll get on the exam, but it is still important to be on
 * alert for details.
 */
public class AutocloseableFlow2 {
	static class Door implements AutoCloseable {
		@Override
		public void close() {
			System.out.print("D");
			throw new RuntimeException();
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
		try {
//			Door d = new Door();Window w = new Window()
//		}
//		{
			System.out.print("T");
		} catch (Exception e) {
			System.out.print("E");
		} finally {
			System.out.print("F");
		}
	}
}
