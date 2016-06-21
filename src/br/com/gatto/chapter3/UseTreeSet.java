package br.com.gatto.chapter3;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class UseTreeSet {
	static class Rabbit {
		int id;
	}
	
	public static void main(String[] args) {
		Set<Duck> ducks = new TreeSet<>();
		ducks.add(new Duck("Puddles", 7));
		
		Set<Rabbit> rabbits = new TreeSet<>(new Comparator<Rabbit>() {
			@Override
			public int compare(Rabbit o1, Rabbit o2) {
				return o1.id = o2.id;
			}
		});
		rabbits.add(new Rabbit());
		
		Map<Rabbit, String> rabbits2 = new TreeMap<>(new Comparator<Rabbit>() {
			@Override
			public int compare(Rabbit o1, Rabbit o2) {
				return o1.id = o2.id;
			}
		});
		rabbits2.put(new Rabbit(), "test");
		
	}
}
