package br.com.gatto.chapter8.exercises;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

/**
 * Exercise 1 
 * Explanation: A, D. The reference is for an InputStream object, so
 * only a high-level input Stream class is permitted. B is incorrect because
 * FileInputStream is a low-level stream that interacts directly with a file
 * resource, not a stream resource. C and F are incorrect because you cannot use
 * BufferedReader/ BufferedWriter directly on a stream. E is incorrect because
 * the reference is to an InputStream, not an OutputStream. A and D are the only
 * correct options. Note that a BufferedInputStream can be wrapped twice, since
 * high-level streams can take other high-level streams.
 */
public class Exercise1 {
	public static void main(String[] args) throws IOException {
		InputStream is = new BufferedInputStream(new FileInputStream("zoo.txt"));
		InputStream wrapper = new BufferedInputStream(is);
		InputStream wrapper2 = new ObjectInputStream(is);
	}
}
