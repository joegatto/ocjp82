package br.com.gatto.chapter4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamIntermediateOperationTests {
	public static void main(String[] args) {

		System.out.println("************** filter() **************");
		Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
		s.filter(x -> x.startsWith("m")).forEach(System.out::print);

		System.out.println();
		System.out.println("************** distinct() **************");
		Stream<String> s1 = Stream.of("duck", "duck", "duck", "goose");
		s1.distinct().forEach(System.out::print);

		System.out.println();
		System.out.println("************** limit() and skip() **************");
		Stream<Integer> s2 = Stream.iterate(1, n -> n + 1);
		s2.skip(5).limit(2).forEach(System.out::print);

		System.out.println();
		System.out.println("************** map() **************");
		s = Stream.of("monkey", "gorilla", "bonobo");
		s.map(String::length).forEach(System.out::print);

		System.out.println();
		System.out.println("************** flatMap() **************");
		List<String> zero = Arrays.asList();
		List<String> one = Arrays.asList("Bonobo");
		List<String> two = Arrays.asList("Mama Gorilla", "Baby Gorilla");
		Stream<List<String>> animals = Stream.of(zero, one, two);
		animals.flatMap(l -> l.stream()).forEach(System.out::println);

		System.out.println("************** sorted() **************");
		Stream<String> s3 = Stream.of("brown-", "bear-");
		s3.sorted().forEach(System.out::print);

		System.out.println();
		Stream<String> s4 = Stream.of("brown bear-", "grizzly-");
		s4.sorted(Comparator.reverseOrder()).forEach(System.out::print);

		System.out.println();
		System.out.println("************** peek() **************");
		Stream<String> s5 = Stream.of("black bear", "brown bear", "grizzly");
		long count = s5.filter(x -> x.startsWith("g")).peek(System.out::println).count();
		System.out.println(count);
	}
}
