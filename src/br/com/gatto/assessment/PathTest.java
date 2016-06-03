package br.com.gatto.assessment;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * The code compiles and runs without issue, so E and F are incorrect. For this
 * question, it helps if you resolve each path to a simplified form component
 * before answering it. The path1 variable simplifies to /bats/sleep.txt after
 * the Path operations have been applied. The path2 variable using the current
 * directory of /bats/day is assigned a path value of /bats/sleep.txt. Since the
 * file Path objects represent the same path within the file system, they will
 * return true for both equals() and isSameFile(), so A is the correct answer
 * and B, C, and D are incorrect.
 */
public class PathTest {
	public static void main(String[] args) throws IOException {
		Path path1 = Paths.get("/bats/night", "../").resolve(Paths.get("./sleep.txt")).normalize();
		Path path2 = new File("../sleep.txt").toPath().toRealPath();
		System.out.println(Files.isSameFile(path1, path2));
		System.out.println("" + path1.equals(path2));
	}
}
