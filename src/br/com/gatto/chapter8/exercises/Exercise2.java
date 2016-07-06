package br.com.gatto.chapter8.exercises;

import java.io.Console;
import java.io.IOException;
import java.io.Writer;

/**
 * Exercise 2 
 * Explanation: B, D, E. This is correct code for reading a line from
 * the console and writing it back out to the console, making option B correct.
 * Options D and E are also correct. If no console is available, a
 * NullPointerException is thrown. The append() method throws an IOException.
 *
 */
public class Exercise2 {
	public static void main(String[] args) throws IOException {
		String line;
		Console c = System.console();
		Writer w = c.writer();
		if ((line = c.readLine()) != null)
			w.append(line);
		w.flush();
	}
}
