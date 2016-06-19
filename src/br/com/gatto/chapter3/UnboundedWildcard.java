package br.com.gatto.chapter3;

import java.util.ArrayList;
import java.util.List;

public class UnboundedWildcard {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(new Integer(42));
		// objects.add("forty four");
		// System.out.println(numbers.get(1));

		// Integer[] numbers2 = { new Integer(42) };
		// Object[] objects = numbers2;
		// objects[0] = "forty two";

		List<String> keywords = new ArrayList<>();
		keywords.add("java");
		printList(keywords);
		printList(numbers);
	}

	public static void printList(List<?> list) {
		for (Object x : list) {
			System.out.println(x);
		}
	}
}
