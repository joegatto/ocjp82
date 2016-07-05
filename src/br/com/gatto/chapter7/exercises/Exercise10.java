package br.com.gatto.chapter7.exercises;

import java.util.Arrays;

/**
 * Exercise 10 
 * Explanation: C. The code does not compile, so A and E are
 * incorrect. The problem here is that c1 is a String but c2 is an int, so the
 * code fails to combine on line q2, since calling length() on an int is not
 * allowed, and C is correct. The rest of the lines compile without issue. Note
 * that calling parallel() on an already parallel is allowed, and it may in fact
 * return the same object.
 */
public class Exercise10 {
	public static void main(String[] args) {
		// System.out.println(Arrays.asList("duck", "chicken", "flamingo",
		// "pelican").parallelStream().parallel().reduce(0,
		// (c1, c2) -> c1.length() + c2.length(),
		// (s1, s2) -> s1 + s2));
	}
}
