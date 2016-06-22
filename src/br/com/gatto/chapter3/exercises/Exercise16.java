package br.com.gatto.chapter3.exercises;

import java.util.Comparator;


/**
 * Exercises 16 
 * Explanation: B, D, F. The java.lang.Comparable interface is
 * implemented on the object to compare. It specifies the compareTo() method,
 * which takes one parameter. The java.util.Comparator interface specifies the
 * compare() method, which takes two parameters.
 */
public class Exercise16 implements Comparator<Exercise16> {

	@Override
	public int compare(Exercise16 o1, Exercise16 o2) {
		return 0;
	}

}
