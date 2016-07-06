package br.com.gatto.chapter9.exercises;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Exercise 5 
 * Explanation: B, C, D. The first clause of the if/then statement
 * will be true only if the target of the symbolic link, /mammal/kangaroo,
 * exists, since by default isDirectory() follows symbolic links, so B is
 * correct. Option A is incorrect because /mammal/kangaroo may not exist or
 * /mammal/kangaroo/joey may already exist. If /mammal/kangaroo does exist, then
 * the directory will be created at /mammal/kangaroo/joey, and because the
 * symbolic link would be accessible as /kang/joey, C and D are both correct. E
 * is incorrect, because the code compiles without issue. F is incorrect because
 * the code may throw an exception at runtime, such as when the file system is
 * unavailable or locked for usage; thus it is not guaranteed to throw an
 * exception at runtime.
 */
public class Exercise5 {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("/kang");
		if (Files.isDirectory(path) && Files.isSymbolicLink(path)) {
			Files.createDirectories(path.resolve("joey"));
		}
	}
}
