package br.com.gatto.chapter4.exercises;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Exercise 11 
 * Explanation: B, C, E. As written, the code doesn’t compile
 * because the collector expects to get a String immediately before it in the
 * chain. Option B fixes this, at which point nothing is output because the
 * collector creates a String. Option E fixes this and causes the output to be
 * 11111. Since the post-increment operator is used, the stream contains an
 * infinite number of 1s. Option C fixes this and causes the stream to contain
 * increasing numbers.
 */
public class Exercise11 {
	public static void main(String[] args) {
		System.out.println(Stream.iterate(1, x -> ++x).limit(5).map(x -> "" + x).collect(Collectors.joining()));
	}
}
