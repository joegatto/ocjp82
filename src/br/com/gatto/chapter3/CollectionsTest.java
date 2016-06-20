package br.com.gatto.chapter3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionsTest {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		System.out.println("******* Adding to a list *******");
		System.out.println(list.add("Sparrow"));
		System.out.println(list.add("Sparrow"));

		System.out.println("******* Adding to a set *******");
		Set<String> set = new HashSet<>();
		System.out.println(set.add("Sparrow"));
		System.out.println(set.add("Sparrow"));
	}
}
