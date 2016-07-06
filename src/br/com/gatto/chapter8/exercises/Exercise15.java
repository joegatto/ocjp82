package br.com.gatto.chapter8.exercises;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Exercise 15 Explanation: A. This code compiles and runs without issue, so C
 * and E are incorrect. It uses a try-with-resource block to open the FileReader
 * and BufferedReader objects. Therefore, both get closed automatically, and D
 * is incorrect. The body of the try block reads in the first line of the file
 * and outputs it to the user. Therefore, A is correct. Since the rest of the
 * file is not read, B is incorrect.
 */
public class Exercise15 {
	private void echo() throws IOException {
		try (FileReader fileReader = new FileReader("zoo-data.txt");
				BufferedReader bufferedReader = new BufferedReader(fileReader)) {
			System.out.println(bufferedReader.readLine());
		}
	}
}
