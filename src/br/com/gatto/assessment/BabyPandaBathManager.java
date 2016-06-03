package br.com.gatto.assessment;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

/**
 * The key to understanding this code is to notice that our thread pool size is
 * only 2, but our CyclicBarrier limit is 3. Even though 12 tasks are all
 * successfully submitted to the thread executor service by way of the stream
 * forEach() method, the first two tasks will use up both available threads and
 * wait indefinitely. Since a third await() is never executed, the barrier is
 * never broken and the program hangs
 */
public class BabyPandaBathManager {
	public static void await(CyclicBarrier cb) {
		try {
			cb.await();
		} catch (InterruptedException | BrokenBarrierException e) {
			// Handle exception
		}
	}

	public static void main(String[] args) {
		final CyclicBarrier cb = new CyclicBarrier(3, () -> System.out.println("Clean!"));
		ExecutorService service = Executors.newScheduledThreadPool(2);
		IntStream.iterate(1, i -> 1).limit(12).forEach(i -> service.submit(() -> await(cb)));
		service.shutdown();
	}
}
