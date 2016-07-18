package br.com.gatto.chapter4;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTerminalOperationTests {
	public static void main(String[] args) {

		System.out.println("************** Creating stream sources *****************");

		// Finite streams
		Stream<Integer> empty = Stream.empty();
		Stream<Integer> singleElement = Stream.of(3);
		Stream<Integer> fromArray = Stream.of(3, 5, 6);

		List<String> list = Arrays.asList("a", "b", "c");
		Stream<String> fromList = list.stream();
		Stream<String> fromListParallel = list.parallelStream();

		// Infinite streams
		Stream<Double> randoms = Stream.generate(Math::random);
		Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2);

		System.out.println("************** Common Terminal Operations ****************");

		System.out.println("************ count() ******************");
		Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
		System.out.println(s.count());

		System.out.println("************ min() and max() ******************");
		s = Stream.of("bonobo", "ape", "monkey");
		Optional<String> min = s.min((s1, s2) -> s1.length() - s2.length());
		min.ifPresent(System.out::println);

		Optional<?> minEmpty = Stream.empty().min((s1, s2) -> 0);
		System.out.println(minEmpty.isPresent());

		s = Stream.of("bonobo", "ape", "monkey1");
		Optional<String> max = s.max((s1, s2) -> s1.length() - s2.length());
		max.ifPresent(System.out::println);

		System.out.println("************ findAny() and findFirst() ******************");
		s = Stream.of("monkey", "gorilla", "bonobo");
		Stream<String> infinite = Stream.generate(() -> "chimp");
		s.findAny().ifPresent(System.out::println);
		infinite.findAny().ifPresent(System.out::println);

		s = Stream.of("monkey", "gorilla", "bonobo");
		infinite = Stream.generate(() -> "chimp");
		s.findFirst().ifPresent(System.out::println);
		infinite.findFirst().ifPresent(System.out::println);

		System.out.println("************ anyMatch(), allMatch() and noneMatch() ******************");
		List<String> list2 = Arrays.asList("monkey", "2", "chimp");
		infinite = Stream.generate(() -> "chimp");
		Predicate<String> pred = x -> Character.isLetter(x.charAt(0));
		System.out.println(list2.stream().anyMatch(pred));
		System.out.println(list2.stream().allMatch(pred));
		System.out.println(list2.stream().noneMatch(pred));
		System.out.println(infinite.anyMatch(pred));

		System.out.println("************ forEach() ******************");
		Stream<String> s1 = Stream.of("Monkey", "Gorilla", "Bonobo");
		s1.forEach(System.out::print);

		System.out.println();
		System.out.println("************ reduce() ******************");
		Stream<String> stream = Stream.of("w", "o", "l", "f");
		String word = stream.reduce("", (x, y) -> x + y);
		System.out.println(word);

		stream = Stream.of("w", "o", "l", "f");
		word = stream.reduce("", String::concat);
		System.out.println(word);

		Stream<Integer> stream2 = Stream.of(3, 5, 6);
		System.out.println(stream2.reduce(1, (a, b) -> a * b));

		BinaryOperator<Integer> op = (a, b) -> a * b;
		empty.reduce(op).ifPresent(System.out::println);
		singleElement.reduce(op).ifPresent(System.out::println);
		fromArray.reduce(op).ifPresent(System.out::println);

		System.out.println("************ collect() ******************");
		stream = Stream.of("w", "o", "l", "f");
		StringBuilder sb = stream.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);
		System.out.println(sb.toString());

		stream = Stream.of("w", "o", "l", "f");
		TreeSet<String> set = stream.collect(TreeSet::new, TreeSet::add, TreeSet::addAll);
		System.out.println(set);

		stream = Stream.of("w", "o", "l", "f");
		TreeSet<String> set2 = stream.collect(Collectors.toCollection(TreeSet::new));
		System.out.println(set2);
		
		stream = Stream.of("w", "o", "l", "f");
		Set<String> set3 = stream.collect(Collectors.toSet());
		System.out.println(set3);
	}
}
