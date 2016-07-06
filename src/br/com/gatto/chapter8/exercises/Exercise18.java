package br.com.gatto.chapter8.exercises;

import java.io.Console;

/**
 * Exercise 18 
 * Explanation: B, D, E. Console defines two output methods,
 * format() and printf(), that are identical in function, so B and D are
 * correct. A, C, and F are each incorrect, because there is no such method with
 * that name defined in the Console class. You can also use the writer() method
 * to gain access to the Console’s PrintWriter object, so E is correct.
 */
public class Exercise18 {
	public static void main(String[] args) {
		Console console = System.console();
		String color = console.readLine("What is your favorite color?");
		console.printf("Your favorite color is " + color);
		console.format("Your favorite color is " + color);
		console.writer().println("Your favorite color is " + color);
	}
}
