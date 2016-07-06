package br.com.gatto.chapter9.exercises;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Exercise 16 
 * Explanation: F. The code compiles without issue, so B, C, and
 * D are incorrect. The code snippet breaks a file into lines and then further
 * separates the lines by commas using the flatMap() method. The result is
 * printed with one entry on a single line, but all original line breaks and
 * commas from the file are removed; therefore F is correct. Since we are told
 * that the file is non-empty and regular, and the program has access to read
 * it, A and E are incorrect.
 */
public class Exercise16 {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("/squid/food-schedule.csv");
		Files.lines(path).flatMap(p -> Stream.of(p.split(","))).map(s -> s.toUpperCase()).forEach(System.out::println);
	}
}
