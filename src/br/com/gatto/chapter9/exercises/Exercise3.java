package br.com.gatto.chapter9.exercises;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * Exercise 3 
 * Explanation: D. The setTimes() method is available only on
 * BasicFileAttributeView, not the read-only BasicFileAttributes class, so line
 * 4 will not compile and D is correct. You need to retrieve an instance of the
 * view class to update the data. The rest of the lines compile without issue
 * and only D is correct.
 */
public class Exercise3 {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("sloth.schedule");
		BasicFileAttributes attributes = Files.readAttributes(path, BasicFileAttributes.class);
		if (attributes.size() > 0 && attributes.creationTime().toMillis() > 0) {
			// attributes.setTimes(null, null, null);
		}
	}
}
