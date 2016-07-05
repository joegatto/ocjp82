package br.com.gatto.chapter7.exercises;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.TimeUnit;

/**
 * Exercise 14 
 * Explanation: D. The methods on line 5, 6, 7, and 8 each throw
 * InterruptedException, which is a checked exception; therefore the method does
 * not compile and C is the only correct answer. If the method signature was
 * updated to include throws InterruptedException, then the answer would be F,
 * because the deque may be blocked at runtime when the offerFirst(),
 * offerLast(), pollFirst(), and pollLast() operations are called. Finally, if
 * they were not blocked and there were no other operations on the deque, then
 * the output would be 20 85, and the answer would be A.
 *
 */
public class Exercise14 {
	public void addAndPrintItems(BlockingDeque<Integer> deque) {
		// deque.offer(103);
		// deque.offerFirst(20, 1, TimeUnit.SECONDS);
		// deque.offerLast(85, 7, TimeUnit.HOURS);
		// System.out.println(deque.pollFirst(200, TimeUnit.NANOSECONDS));
		// System.out.println(deque.pollLast(1, TimeUnit.MINUTES));
	}
}
