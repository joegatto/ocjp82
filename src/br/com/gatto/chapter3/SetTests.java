package br.com.gatto.chapter3;

import java.util.HashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTests {
	public static void main(String[] args) {
		System.out.println("************ Using HashSet ****************");
		Set<Integer> set = new HashSet<>();
		boolean b1 = set.add(66);
		boolean b2 = set.add(10);
		boolean b3 = set.add(66);
		boolean b4 = set.add(8);
		boolean b5 = set.add(42);
		for (Integer integer : set) {
			System.out.println(integer + ", ");
		}

		System.out.println("************ Using TreeSet ****************");
		Set<Integer> set2 = new TreeSet<>();
		b1 = set2.add(66);
		b2 = set2.add(10);
		b3 = set2.add(66);
		b4 = set2.add(8);
		b5 = set2.add(42);
		for (Integer integer : set2) {
			System.out.println(integer + ", ");
		}

		System.out.println("************** NavigableSet *****************");
		NavigableSet<Integer> set3 = new TreeSet<>();
		for (int i = 1; i <= 20; i++) {
			set3.add(i);
		}
		System.out.println(set3.lower(10));
		System.out.println(set3.floor(10));
		System.out.println(set3.ceiling(20));
		System.out.println(set3.higher(20));
	}
}
