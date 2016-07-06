package br.com.gatto.chapter9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FilesTest {
	public static void main(String[] args) {
		System.out.println(Paths.get("/ostrich/feathers.png"));
		System.out.println(Paths.get("/ostrich"));

		System.out.println();
		try {
			System.out.println(Files.isSameFile(Paths.get("/user/home/cobra"), Paths.get("/user/home/snake")));
			System.out.println(Files.isSameFile(Paths.get("/user/tree/../monkey"), Paths.get("/user/monkey")));
			System.out.println(Files.isSameFile(Paths.get("/leaves/./giraffe.exe"), Paths.get("/leaves/giraffe.exe")));
			System.out.println(Files.isSameFile(Paths.get("/flamingo/tail.data"), Paths.get("/cardinal/tail.data")));
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println();
		try {
			Files.createDirectory(Paths.get("/bison/field"));
			Files.createDirectory(Paths.get("/bison/field/pasture/green"));
		} catch (IOException e) {
			e.getStackTrace();
		}

		System.out.println();
		try {
			Files.copy(Paths.get("/panda"), Paths.get("/panda-save"));
			Files.copy(Paths.get("/panda/bamboo.txt"), Paths.get("/panda-save/bamboo.txt"));
		} catch (IOException e) {
			e.getStackTrace();
		}

		System.out.println();
		try {
			Files.move(Paths.get("c:\\zoo"), Paths.get("c:\\zoo-new"));
			Files.move(Paths.get("c:\\user\\addresses.txt"), Paths.get("c:\\zoo-new\\addresses.txt"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println();
		try {
			Files.delete(Paths.get("/vulture/feathers.txt"));
			Files.deleteIfExists(Paths.get("/pigeon"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
