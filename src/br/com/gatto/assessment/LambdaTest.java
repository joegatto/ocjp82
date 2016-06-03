package br.com.gatto.assessment;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * Calling get() on an empty Optional causes an exception to be thrown, making
 * options B and F correct. Option C is incorrect because the infinite stream is
 * made finite by the intermediate limit() operation. Options A and E are
 * incorrect because the source streams are not infinite. Therefore, the call to
 * max() sees only three elements and terminates.
 */
public class LambdaTest {
	private static void magic(Stream<Integer> s) {
		Optional o = s.filter(x -> x < 5).limit(3).max((x, y) -> x - y);
		System.out.println(o.get());
		;
	}

	public static void main(String[] args) {
		// magic(Stream.empty()); //Exception NoSuchElement
		// magic(Stream.iterate(1, x -> x++));
		// magic(Stream.of(5,10)); //Exception NoSuchElement
	}
}
