package br.com.gatto.chapter7.exercises;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.stream.IntStream;

/**
 * Exercise 18 
 * Explanation: F. The code compiles without issue, so B, C, and D
 * are incorrect. The limit on the cyclic barrier is 10, but the stream can
 * generate only up to 9 threads that reach the barrier; therefore the limit can
 * never be reached, and F is the correct answer, making A and E incorrect. Note
 * that even if the limit(9) statement was changed to limit(10), the program
 * could still hang, since the JVM might not allocate 10 threads to the parallel
 * stream.
 *
 */
public class StockRoomTracker {
	public static void await(CyclicBarrier cb) {
		try {
			cb.await();
		} catch (InterruptedException | BrokenBarrierException e) {
			System.err.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		CyclicBarrier cb = new CyclicBarrier(10, () -> System.out.println("Stock Room Full"));
		IntStream.iterate(1, i -> 1).limit(9).parallel().forEach(i -> await(cb));
	}
}
