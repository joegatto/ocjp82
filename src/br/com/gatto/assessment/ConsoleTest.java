package br.com.gatto.assessment;

import java.io.Console;

/**
 * Option B is correct because this is the right way to read data from the
 * Console. Option D is also correct. If there is no console available, a
 * NullPointerException is thrown. The read method does not throw an
 * IOException.
 */
public class ConsoleTest {
	public static void main(String[] args) {
		String line;
		Console c = System.console();
		if ((line = c.readLine()) != null)
			System.out.println(line);
	}
}
