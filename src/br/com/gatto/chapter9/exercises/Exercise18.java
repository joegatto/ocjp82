package br.com.gatto.chapter9.exercises;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Exercise 18 
 * Explanation: D. The code compiles and runs without issue, so F is
 * incorrect. The one thing to notice about these paths is that they represent
 * the same path within the file system. Therefore, isSameFile() would return
 * true and B and C are incorrect. The second output is false, because
 * Path.equals() does not resolve the path within the file system, so A is
 * incorrect. Finally, the normalized paths are equals(), since all extra
 * symbols have been removed; therefore D is correct and E is incorrect.
 *
 */
public class Exercise18 {
	public static void main(String[] args) throws IOException {
		Path path1 = Paths.get("/lizard/./").resolve(Paths.get("walking.txt"));
		Path path2 = new File("/lizard/././actions/../walking.txt").toPath();

		System.out.print(Files.isSameFile(path1, path2));
		System.out.print(" " + path1.equals(path2));
		System.out.print(" " + path1.normalize().equals(path2.normalize()));
	}
}
