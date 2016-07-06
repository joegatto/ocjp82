package br.com.gatto.chapter9.exercises;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Exercise6
 * Explanation: C. The code does not compile since the stream output
 * by Files.walk() is Stream<Path>, therefore we need a Predictate, not a
 * BiPredicate, on line w1, and the answer is C. If the Files.find() method had
 * been used instead, and the lambda had been passed as an argument to the
 * method instead of on filter(), the output would be B, Has Sub-directory,
 * since the directory is given to be empty. For fun, we reversed the expected
 * output of the ternary operation to make sure that you understood the process.
 */
public class Exercise6 {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("/animals");
		boolean myBoolean = Files.walk(path)
//				.filter((p, a) -> a.isDirectory() && !path.equals(p))
				.findFirst().isPresent();
		System.out.println(myBoolean ? "No Sub-directory" : "Has Sub-directory");
	}
}
