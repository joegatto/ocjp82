package br.com.gatto.chapter9;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTests {
	public static void main(String[] args) {
		Path path = Paths.get("/land/hippo/harry.happy");
		System.out.println("The path name is: " + path);
		for (int i = 0; i < path.getNameCount(); i++) {
			System.out.println("Element " + i + " is: " + path.getName(i));
		}

		System.out.println();
		printPathInformation(Paths.get("/zoo/armadillo/shells.txt"));
		System.out.println();
		printPathInformation(Paths.get("armadillo/shells.txt"));

		System.out.println();
		Path path1 = Paths.get("C:\\birds\\egret.txt");
		System.out.println("Path1 is Absolute? " + path1.isAbsolute());
		System.out.println("Absolute Path1:" + path1.toAbsolutePath());
		Path path2 = Paths.get("bird/condor.txt");
		System.out.println("Path2 is Absolute? " + path2.isAbsolute());
		System.out.println("Absolute Path2:" + path2.toAbsolutePath());

		System.out.println();
		path = Paths.get("/mamal/carnivore/raccoon.image");
		System.out.println("Path is: " + path);
		System.out.println("Subpath from 0 to 3 is: " + path.subpath(0, 3));
		System.out.println("Subpath from 1 to 3 is: " + path.subpath(1, 3));
		System.out.println("Subpath from 1 to 2 is: " + path.subpath(1, 2));

		System.out.println();
		path1 = Paths.get("fish.txt");
		path2 = Paths.get("birds.txt");
		System.out.println(path1.relativize(path2));
		System.out.println(path2.relativize(path1));
		Path path3 = Paths.get("E:\\habitat");
		Path path4 = Paths.get("E:\\sanctuary\\raven");
		System.out.println(path3.relativize(path4));
		System.out.println(path4.relativize(path3));

		System.out.println();
		path1 = Paths.get("/cats/../panther");
		path2 = Paths.get("food");
		System.out.println(path1.resolve(path2));

		System.out.println();
		path3 = Paths.get("E:\\data");
		path4 = Paths.get("E:\\user\\home");
		Path relativePath = path3.relativize(path4);
		System.out.println(relativePath);
		System.out.println(path3.resolve(relativePath));
		System.out.println(path3.resolve(relativePath).normalize());

		System.out.println();
		try {
			System.out.println(Paths.get("/zebra/food.source").toRealPath());
			System.out.println(Paths.get(".././food.txt").toRealPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println();
	}

	public static void printPathInformation(Path path) {
		System.out.println("Filename is: " + path.getFileName());
		System.out.println("Root is " + path.getRoot());

		Path currentParent = path;
		while ((currentParent = currentParent.getParent()) != null) {
			System.out.println("Current parent is: " + currentParent);

		}
	}
}
