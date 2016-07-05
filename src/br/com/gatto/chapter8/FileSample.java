package br.com.gatto.chapter8;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;

public class FileSample {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		System.out.println(System.getProperty("file.separator"));
		System.out.println(File.separator);

		File file = new File("C:\\files\\test.txt");
		System.out.println(file.exists());

		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader("zoo-data.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try (ObjectInputStream objectInputStream = new ObjectInputStream(
				new BufferedInputStream(new FileInputStream("zoo-data.txt")))) {
			System.out.println(objectInputStream.readObject());
		} 
	}
}
