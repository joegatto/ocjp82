package br.com.gatto.chapter9.exercises;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;


/**
 * Exercise 17 
 * Explanation: A, G. The code compiles without issue, so B, C,
 * and D are incorrect. The first line actually resolves to the root path since
 * .. and getParent() are conceptually equivalent. Therefore, G is correct and E
 * and F are incorrect. A is also correct since it may encounter a file that it
 * does not have access to read, which is common when trying to read an entire
 * file system.
 */
public class Exercise17 {
	public static void main(String[] args) throws IOException {
		Files.walk(Paths.get("..").toRealPath().getParent())
		.map(p->p.toAbsolutePath().toString())
		.filter(s->s.endsWith(".java"))
		.collect(Collectors.toList())
		.forEach(System.out::println);
	}
}
