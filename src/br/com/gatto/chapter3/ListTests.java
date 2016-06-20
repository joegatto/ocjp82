package br.com.gatto.chapter3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTests {
	public static void main(String[] args) {
		List<String> birds = new ArrayList<>();
		System.out.println("******* isEmpty and size methods *******");
		System.out.println(birds.isEmpty());
		System.out.println(birds.size());
		birds.add("hawk");
		birds.add("hawk");
		System.out.println("******* contains method *******");
		System.out.println(birds.contains("robin"));
		System.out.println(birds.contains("hawk"));
		System.out.println("******* isEmpty and size methods *******");
		System.out.println(birds.isEmpty());
		System.out.println(birds.size());
		System.out.println("******* remove method *******");
		System.out.println(birds.remove("cardinal"));
		System.out.println(birds.remove("hawk"));
		System.out.println(birds);
		birds.clear();
		System.out.println("******* contains method after clearing the list *******");
		System.out.println(birds.isEmpty());
		System.out.println(birds.size());

		List<String> list2 = new ArrayList<>();
		list2.add("SD");
		list2.add(0, "NY");
		list2.set(1, "FL");
		list2.remove("NY");
		list2.remove(0);
		list2.add("OH");
		list2.add("CO");
		list2.add("NJ");
		String state = list2.get(0);
		int index = list2.indexOf("NJ");

		Iterator<String> iter = list2.iterator();
		while (iter.hasNext()) {
			String string = iter.next();
			System.out.println(string);
		}
	}
}
