package br.com.gatto.chapter3.exercises;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Exercise 10 
 * Explanation: A. The array is sorted using MyComparator, which
 * sorts the elements in reverse alphabetical order in a case-insensitive
 * fashion. Normally, numbers sort before letters. This code reverses that by
 * calling the compareTo() method on b instead of a.
 */
public class MyComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		return o2.toLowerCase().compareTo(o1.toLowerCase());
	}

	public static void main(String[] args) {
		String[] values = { "123", "Abb", "aab" };
		Arrays.sort(values, new MyComparator());
		for (String s : values) {
			System.out.print(s + " ");
		}
	}
}
