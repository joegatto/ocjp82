package br.com.gatto.chapter3.exercises;

import java.util.TreeSet;

/**
 * Exercise 8 
 * Explanation: C. TreeSet sorts the elements. Since uppercase
 * letters sort before lowercase letters, the ordering is "ONE", "One", "one".
 * The ceiling() method returns the smallest element greater than the specified
 * one. "On" appears between "ONE" and "One". Therefore, the smallest element
 * that is larger than the specified value is "One".
 */
public class Exercise8 {
	public static void main(String[] args) {
		TreeSet<String> tree = new TreeSet<String>();
		tree.add("one");
		tree.add("One");
		tree.add("ONE");
		System.out.println(tree.ceiling("On"));
	}
}
