package br.com.gatto.chapter9.exercises;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * Exercise 11 
 * Explanation: A. The code compiles and runs without issue, so
 * C, D, E, and F are incorrect. Even though the file is copied with attributes
 * preserved, the file is considered a separate file, so the output is false and
 * A is correct and B is incorrect. Remember, isSameFile()returns true only if
 * the files pointed to in the file system are the same, without regard to the
 * file contents.
 */
public class Exercise11 {
	public static void main(String[] args) throws IOException {
		Path path1 = Paths.get("./goal.txt").normalize();
		Path path2 = Paths.get("mule.png");

		Files.copy(path1, path2, StandardCopyOption.COPY_ATTRIBUTES);

		System.out.println(Files.isSameFile(path1, path2));
	}
}
