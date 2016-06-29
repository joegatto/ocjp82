package br.com.gatto.chapter4.exercises;

import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Exercise 3 
 * Explanation: E. An infinite stream is generated where each
 * element is twice as long as the previous one. b1 is set to false because Java
 * finds an element that doesnâ€™t match when it gets to the element of length
 * 4. However, the next line tries to operate on the same stream. Since streams
 * can be used only once, this throws an exception that the â€œstream has
 * already been operated upon or closed.â€� If two different streams were used,
 * the result would be option A.
 */
public class Exercise3 {
	public static void main(String[] args) {
		Predicate<? super String> predicate = s -> s.length() > 3;
		Stream<String> stream = Stream.iterate("-", (s) -> s + s);

		boolean b1 = stream.noneMatch(predicate);
		boolean b2 = stream.anyMatch(predicate);

		System.out.println(b1 + " " + b2);
	}
}
