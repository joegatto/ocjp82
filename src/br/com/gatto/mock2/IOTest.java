package br.com.gatto.mock2;

import java.io.BufferedReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class IOTest {

	public static void main(String[] args) {
		Path myfile = Paths.get("test.txt");
		try (BufferedReader bfr = Files.newBufferedReader(myfile, Charset.forName("US-ASCII"))) {
			String line = null;
			while ((line = bfr.readLine()) != null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
