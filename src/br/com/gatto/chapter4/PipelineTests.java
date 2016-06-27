package br.com.gatto.chapter4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class PipelineTests {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Toby", "Anna", "Leroy", "Alex");
		list.stream().filter(n -> n.length() == 4).sorted().limit(2).forEach(System.out::println);

		Stream.generate(() -> "Elsa").filter(n -> n.length() == 4).limit(2).forEach(System.out::println);

		Stream<Integer> infinite = Stream.iterate(1, x -> x + 1);
		infinite.limit(5).filter(x -> x % 2 == 1).forEach(System.out::print);

		System.out.println();
		infinite = Stream.iterate(1, x -> x + 1);
		infinite.limit(5).peek(System.out::print).filter(x -> x % 2 == 1).forEach(System.out::print);

		System.out.println();
		infinite = Stream.iterate(1, x -> x + 1);
		infinite.filter(x -> x % 2 == 1).limit(5).forEach(System.out::print);
		System.out.println();
		infinite = Stream.iterate(1, x -> x + 1);
		infinite.filter(x -> x % 2 == 1).peek(System.out::print).limit(5).forEach(System.out::print);
	}
}
