package br.com.gatto.chapter6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class TryWithResources {
	public void oldApproach(Path p1, Path p2) throws IOException {
		BufferedReader in = null;
		BufferedWriter out = null;

		try {
			in = Files.newBufferedReader(p1);
			out = Files.newBufferedWriter(p2);
			out.write(in.readLine());
		} finally {
			if (in != null)
				in.close();
			if (out != null)
				out.close();
		}
	}

	public void newApproach(Path p1, Path p2) throws IOException {
		try (BufferedReader in = Files.newBufferedReader(p1); BufferedWriter out = Files.newBufferedWriter(p2)) {
			out.write(in.readLine());
		} catch (IOException e) {

		} finally {

		}

		try (Scanner s = new Scanner(System.in)) {
			s.nextLine();
		} catch (Exception e) {
			// s.nextLine();
		} finally {
			// s.nextLine();
		}
	}

}
