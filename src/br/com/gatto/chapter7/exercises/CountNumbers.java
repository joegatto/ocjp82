package br.com.gatto.chapter7.exercises;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;

/**
 * Exercise 12 
 * Explanation: E. The program compiles without issue, so B, C, and
 * D are incorrect. Lines m2 and m3 throw a compiler warning about generics but
 * still compile. Notice that RecursiveAction, unlike RecursiveTask, does not
 * return a value. However, since we used a generic ForkJoinTask reference, the
 * code still compiles. The issue here is that the base condition is not reached
 * since the numbers start/ end are consistently positive. This causes an
 * infinite loop, although since memory is finite, Java detects this and throws
 * a StackOverflowError, so E is correct. In practice, this could also generate
 * a locking exception before the StackOverflowError when the program runs out
 * of memory, but in either circumstance, the program will exit.
 */
public class CountNumbers extends RecursiveAction {

	private int start;
	private int end;

	public CountNumbers(int start, int end) {
		this.start = start;
		this.end = end;
	}

	@Override
	protected void compute() {
		if (start < 0)
			return;
		else {
			int middle = start + ((end - start) / 2);
			invokeAll(new CountNumbers(start, middle), new CountNumbers(middle, end));
		}
	}

	public static void main(String[] args) {
		ForkJoinTask<?> task = new CountNumbers(0, 4);
		ForkJoinPool pool = new ForkJoinPool();
		Object result = pool.invoke(task);
	}
}
