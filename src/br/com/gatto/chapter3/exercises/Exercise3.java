package br.com.gatto.chapter3.exercises;

import java.util.ArrayList;
import java.util.List;


/**
 * Exercise 3 
 * Explanation: E. The code does not compile. It attempts to mix
 * generics and legacy code. Lines 3 through 7 create an ArrayList without
 * generics. This means that we can put any objects in it. Line 7 should be
 * looping through a list of Objects rather than Strings since we didn’t use
 * generics.
 */
public class Exercise3 {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("one");
		list.add("two");
		list.add(7);
		// for (String s : list) {
		// System.out.println(s);
		// }
	}
}
