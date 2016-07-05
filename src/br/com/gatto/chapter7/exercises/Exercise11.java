package br.com.gatto.chapter7.exercises;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Exercise 11 
 * Explantion: A, F. The code compiles without issue, so D and E are
 * incorrect. Since both tasks are submitted to the same thread executor pool,
 * the order cannot be determined, so B and C are incorrect and A is correct.
 * The key here is that the way the resources o1 and o2 are synchronized, a
 * deadlock could appear if the first thread gets o1 and the second thread gets
 * o2; therefore F is correct. The code cannot produce a livelock, since both
 * threads are waiting, so G is incorrect. Finally, if a deadlock does occur, an
 * exception will not be thrown, so H is incorrect.
 */
public class Exercise11 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Object o1 = new Object();
		Object o2 = new Object();
		ExecutorService service = Executors.newFixedThreadPool(2);
		Future<?> f1 = service.submit(() -> {
			synchronized (o1) {
				synchronized (o2) {
					System.out.println("Tortoise");
				}
			}
		});
		Future<?> f2 = service.submit(() -> {
			synchronized (o1) {
				synchronized (o2) {
					System.out.println("Hare");
				}
			}
		});
		f1.get();
		f2.get();
	}
}
