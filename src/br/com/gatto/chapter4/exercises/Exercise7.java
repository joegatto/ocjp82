package br.com.gatto.chapter4.exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise7 {
	public static void main(String[] args) {

	}

	private static List<String> sortUsingList(List<String> list) {
		List<String> copy = new ArrayList<>(list);
		Collections.sort(copy, (a, b) -> b.compareTo(a));
		return copy;
	}

	private static List<String> sortUsingStream(List<String> list) {
		return list.stream().sorted((a, b) -> b.compareTo(a)).collect(Collectors.toList());
	}
}
