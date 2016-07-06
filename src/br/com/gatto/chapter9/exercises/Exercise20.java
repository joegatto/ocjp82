package br.com.gatto.chapter9.exercises;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Exercise 20 
 * Explanation: B. The normalize() method does not convert a
 * relative path into an absolute path; therefore, the path value after the
 * first line is just the current directory symbol. The for() loop iterates the
 * name values, but since there is only one entry, the loop terminates after a
 * single iteration. Therefore, B is correct and the rest of the answers are
 * incorrect.
 */
public class Exercise20 {
	public static void main(String[] args) {
		final Path path = Paths.get(".").normalize();
		int count = 0;
		for (int i = 0; i < path.getNameCount(); i++) {
			count++;
		}
		System.out.println(count);
	}
}
