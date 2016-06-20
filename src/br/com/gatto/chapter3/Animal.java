package br.com.gatto.chapter3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Animal implements Comparable<Animal> {
	private int id;

	@Override
	public int compareTo(Animal o) {
		return id - o.id;
	}

	@Override
	public String toString() {
		return new Integer(id).toString();
	}

	public static void main(String[] args) {
		Animal a1 = new Animal();
		Animal a2 = new Animal();
		a1.id = 5;
		a2.id = 7;

		System.out.println(a1.compareTo(a2));
		System.out.println(a1.compareTo(a1));
		System.out.println(a2.compareTo(a1));

		List<Animal> animals = new ArrayList<>();
		animals.add(a1);
		animals.add(a2);

		Collections.sort(animals);
		System.out.println(animals);
	}

}
