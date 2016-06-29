package br.com.gatto.chapter4.exercises;

import java.util.stream.Stream;

/**
 * Exercises 1 
 * Explanation: D. No terminal operation is called, so the stream
 * never executes. The methods chain to create a stream that would contain
 * â€œ2â€� and â€œ12.â€� The first line creates an infinite stream. The second
 * line would get the first two elements from that infinite stream and map each
 * element to add an extra character.
 */
public class Exercise1 {
	public static void main(String[] args) {
		Stream<String> stream = Stream.iterate("", (s) -> s + "1");
		System.out.println(stream.limit(2).map(x -> x + "2"));
	}
}
