package br.com.gatto.chapter3;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class MapsApi {
	public static void main(String[] args) {
		Map<String, String> favorites = new HashMap<>();
		favorites.put("Jenny", "Bus Tour");
		favorites.put("Jenny", "Tram");
		System.out.println(favorites);
		favorites.clear();

		System.out.println("****************** putIfAbsent ********************");
		favorites.put("Jenny", "Bus Tour");
		favorites.put("Tom", null);

		favorites.putIfAbsent("Jenny", "Tram");
		favorites.putIfAbsent("Sam", "Tram");
		favorites.putIfAbsent("Tom", "Tram");
		System.out.println(favorites);
		favorites.clear();

		System.out.println("****************** merge ********************");
		BiFunction<String, String, String> mapper = (v1, v2) -> v1.length() > v2.length() ? v1 : v2;

		favorites.put("Jenny", "Bus Tour");
		favorites.put("Tom", "Tram");
		favorites.put("Sam", null);

		String jenny = favorites.merge("Jenny", "Skyride", mapper);
		String tom = favorites.merge("Tom", "Skyride", mapper);
		String sam = favorites.merge("Sam", "Skyride", mapper);

		System.out.println(favorites);
		System.out.println(jenny);
		System.out.println(tom);
		System.out.println(sam);

		System.out.println("****************** computeIfPresent and computeIfAbsent ********************");
		Map<String, Integer> counts = new HashMap<>();
		counts.put("Jenny", 15);
		counts.put("Tom", null);

		BiFunction<String, Integer, Integer> mapper2 = (k, v) -> v + 1;
		Integer jenny2 = counts.computeIfPresent("Jenny", mapper2);
		Integer sam2 = counts.computeIfPresent("Sam", mapper2);
		System.out.println(counts);
		System.out.println(jenny2);
		System.out.println(sam2);

		Function<String, Integer> mapper3 = (k) -> 1;
		Integer jenny3 = counts.computeIfAbsent("Jenny", mapper3);
		Integer sam3 = counts.computeIfAbsent("Sam", mapper3);
		Integer tom3 = counts.computeIfAbsent("Tom", mapper3);
		System.out.println(counts);

	}
}
