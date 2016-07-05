package br.com.gatto.chapter7.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.IntStream;

/**
 * Exercise 22 
 * Explanation: F. The key to solving this question is to remember
 * that the execute() method returns void, not a Future object. Therefore, line
 * n1 does not compile and F is the correct answer. If the submit() method had
 * been used instead of execute(), then C would have been the correct answer, as
 * the output of submit(Runnable) task is a Future<?> object which can only
 * return null on its get() method.
 */
public class PrintCounter {
	static int counter = 0;

	public static void main(String[] args) {
		ExecutorService service = Executors.newSingleThreadExecutor();
		List<Future<?>> results = new ArrayList<>();
		// IntStream.iterate(0, i -> i + 1).limit(5).forEach(i ->
		// results.add(service.execute(() -> counter++)));
		// for (Future<?> result : results) {
		// System.out.println(result.get() + " ");
		// }
		service.shutdown();
	}
}
