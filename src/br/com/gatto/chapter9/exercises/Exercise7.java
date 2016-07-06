package br.com.gatto.chapter9.exercises;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Exercise7 {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("turkey");
		if (Files.isSameFile(path, Paths.get("/zoo/turkey")))
			Files.createDirectory(path.resolve("info"));
	}
}
