package br.com.gatto.chapter7.exercises;

import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Exercise 13 
 * Explanation:A, G. The code compiles and runs without issue, so C,
 * D, E, and F are incorrect. The collect() operation groups the animals into
 * those that do and do not start with the letter p. Note that there are four
 * animals that do not start with the letter p and three animals that do. The
 * negation operator ! before the startsWith() method means that results are
 * reversed, so the output is 3 4 and A is correct, making B incorrect. Finally,
 * the stream created by flatMap() is a new stream that is not parallel by
 * default, even though its elements are parallel streams. Therefore, the
 * performance will be single-threaded and G is correct.
 */
public class Exercise13 {
	public static void main(String[] args) {
		Stream<String> cats = Stream.of("leopard", "lynx", "ocelot", "puma").parallel();
		Stream<String> bears = Stream.of("panda", "grizzly", "polar").parallel();

		ConcurrentMap<Boolean, List<String>> data = Stream.of(cats, bears).flatMap(s -> s)
				.collect(Collectors.groupingByConcurrent(s -> !s.startsWith("p")));
		System.out.println(data.get(false).size() + " " + data.get(true).size());
	}
}
