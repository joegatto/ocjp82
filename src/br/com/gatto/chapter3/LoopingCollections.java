package br.com.gatto.chapter3;

import java.util.Arrays;
import java.util.List;

public class LoopingCollections {
	public static void main(String[] args) {
		List<String> cats = Arrays.asList("Annie", "Ripley");
		for (String cat : cats) {
			System.out.println(cat);
		}
		
		cats.forEach(c -> System.out.println(c));
		
		cats.forEach(System.out::println);
	}
}
