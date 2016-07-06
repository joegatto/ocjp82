package br.com.gatto.chapter9.exercises;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Exercise 4 
 * Explanation: C. First off, the code compiles without issue, so G
 * is incorrect. Let’s take this one step at a time. First, the subpath() method
 * is applied to the absolute path, which returns the relative path
 * animals/bear. Next, the getName() method is applied to the relative path, and
 * since this is indexed from zero, it returns the relative path bear. Finally,
 * the toAbsolutePath() method is applied to the relative path bear, resulting
 * in the current directory being incorporated into the path. The final output
 * is the absolute path /user/home/bear, so C is correct.
 */
public class Exercise4 {
	public static void main(String[] args) {
		Path path = Paths.get("/zoo/animals/bear/koala/food.txt");
		System.out.println(path.subpath(1, 3).getName(1).toAbsolutePath());
	}
}
