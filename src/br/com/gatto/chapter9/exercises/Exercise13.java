package br.com.gatto.chapter9.exercises;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;

/**
 * Exercise 13 Explanation: 13- B. The code compiles and runs without issue, so
 * C, D, E, F, and G are incorrect. Note that the sample code creates a stream,
 * collects it as a list, and then converts it back to a stream before
 * outputting the filenames. The key here is that the depth parameter specified
 * as the second argument to find() is 0, meaning the only record that will be
 * searched is the top-level directory. Since we know that the top directory is
 * regular and not a symbolic link, no other paths will be visited and nothing
 * will be printed. For these reasons, B is the correct answer and A is
 * incorrect.
 */
public class Exercise13 {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("/monkeys");
		Files.find(path, 0, (p, a) -> a.isSymbolicLink()).map(p -> p.toString())
		.collect(Collectors.toList())
		.stream()
		.filter(x -> x.toString().endsWith(".txt"))
		.forEach(System.out::println);
	}
}
