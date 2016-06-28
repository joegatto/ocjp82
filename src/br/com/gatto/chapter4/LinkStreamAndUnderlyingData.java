package br.com.gatto.chapter4;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class LinkStreamAndUnderlyingData {
	public static void main(String[] args) {
		List<String> cats = new ArrayList<>();
		cats.add("Annie");
		cats.add("Ripley");
		Stream<String> stream = cats.stream();
		cats.add("KC");
		System.out.println(stream.count());
	}

	private static void threeDigit(Optional<Integer> optional) {
		optional.map(n -> "" + n).filter(s -> s.length() == 3).ifPresent(System.out::println);
	}
}
