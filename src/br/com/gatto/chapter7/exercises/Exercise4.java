package br.com.gatto.chapter7.exercises;

import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.IntStream;

/**
 * Exercise 4 
 * Explanation: 4- C. The code compiles and runs without throwing an
 * exception or entering an infinite loop, so D, E, and F are incorrect. The key
 * here is that the increment operator ++ is not atomic. While the first part of
 * the output will always be 100, the second part is nondeterministic. It could
 * output any value from 1 to 100, because the threads can overwrite each
 * other�s work. Therefore, C is the correct answer and A and B are incorrect.
 */
public class Exercise4 {
	public static void main(String[] args) {
		AtomicLong value1 = new AtomicLong(0);
		final long[] value2 = { 0 };
		IntStream.iterate(1, i -> 1).limit(100).parallel().forEach(i -> value1.incrementAndGet());
		IntStream.iterate(1, i -> 1).limit(100).parallel().forEach(i -> ++value2[0]);
		System.out.println(value1 + " " + value2[0]);
	}
}
