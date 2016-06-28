package br.com.gatto.chapter4;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimitiveStreams {
	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(1, 2, 3);
		System.out.println(stream.reduce((s, n) -> s + n));

		stream = Stream.of(1, 2, 3);
		System.out.println(stream.mapToInt(x -> x).sum());

		IntStream intStream = IntStream.of(1, 2, 3);
		OptionalDouble avg = intStream.average();
		System.out.println(avg.getAsDouble());

		DoubleStream empty = DoubleStream.empty();
		DoubleStream oneValue = DoubleStream.of(3.14);
		DoubleStream varargs = DoubleStream.of(1.0, 1.1, 1.2);
		oneValue.forEach(System.out::println);
		System.out.println();
		varargs.forEach(System.out::println);

		DoubleStream random = DoubleStream.generate(Math::random);
		DoubleStream fractions = DoubleStream.iterate(.5, d -> d / 2);
		random.limit(3).forEach(System.out::println);
		System.out.println();
		fractions.limit(3).forEach(System.out::println);

		IntStream count = IntStream.iterate(1, n -> n + 1).limit(5);
		count.forEach(System.out::println);

		IntStream range = IntStream.range(0, 6);
		range.forEach(System.out::println);

		IntStream rangeClosed = IntStream.rangeClosed(0, 5);
		rangeClosed.forEach(System.out::println);

		Stream<String> objStream = Stream.of("peguin", "fish");
		IntStream inStream = objStream.mapToInt(s -> s.length());
	}
}
