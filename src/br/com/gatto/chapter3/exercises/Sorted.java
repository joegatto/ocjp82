package br.com.gatto.chapter3.exercises;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * Exercise 14 
 * Explanation: C. This question is hard because it defines both
 * Comparable and Comparator on the same object. t1 doesn’t specify a
 * Comparator so it uses the Comparable object’s compareTo() method. This
 * sorts by the text instance variable. t2 did specify a Comparator when calling
 * the constructor, so it uses the compare() method, which sorts by the int.
 */
public class Sorted implements Comparable<Sorted>, Comparator<Sorted> {
	private int num;
	private String text;

	public Sorted(int num, String text) {
		this.num = num;
		this.text = text;
	}

	@Override
	public int compare(Sorted o1, Sorted o2) {
		return o1.num - o2.num;
	}

	@Override
	public int compareTo(Sorted o) {
		return text.compareTo(o.text);
	}

	@Override
	public String toString() {
		return "" + num;
	}

	public static void main(String[] args) {
		Sorted s1 = new Sorted(88, "a");
		Sorted s2 = new Sorted(55, "b");
		TreeSet<Sorted> t1 = new TreeSet<>();
		t1.add(s1); t1.add(s2);
		TreeSet<Sorted> t2 = new TreeSet<>(t1);
		t2.add(s1); t2.add(s2);
		System.out.println(t1 + " " + t2);
	}
}
