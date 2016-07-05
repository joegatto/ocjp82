package br.com.gatto.chapter7.exercises;

import java.util.Arrays;

/**
 * Exercise 8 
 * Explanation: G. The code compiles and runs without issue, so C, D,
 * E, F, and H are incorrect. There are two important things to notice: first,
 * synchronizing on the first output doesn’t actually impact the results of
 * the code. Second, sorting on a parallel stream does not mean that findAny()
 * will return the first record. The findAny() method will return the value from
 * the first thread that retrieves a record. Therefore, the output is not
 * guaranteed for either serial or parallel stream. Since the results cannot be
 * predicted ahead of time, G is the correct answer.
 */
public class Exercise8 {
	public static void main(String[] args) {
		Integer i1 = Arrays.asList(1, 2, 3, 4, 5).stream().findAny().get();
		synchronized (i1) {
			Integer i2 = Arrays.asList(6, 7, 8, 9, 10).parallelStream().sorted().findAny().get();
			System.out.println(i1 + " " + i2);
		}
	}
}
