package br.com.gatto.chapter7.exercises;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Exercise 17 
 * Explanation: B. The code compiles and runs without issue, so D,
 * E, F, and G are incorrect. The key aspect to notice in the code is that a
 * single-thread executor is used, meaning that no task will be executed
 * concurrently. Therefore, the results are valid and predictable with 100 100
 * being the output, and B is the correct answer. If a pooled thread executor
 * was used with at least two threads, then the sheepCount2++ operations could
 * overwrite each other, making the second value indeterminate at the end of the
 * program. In this case, C would be the correct answer.
 */
public class SheepManager {
	private static AtomicInteger sheepCount1 = new AtomicInteger(0);
	private static int sheepCount2 = 0;

	public static void main(String[] args) throws InterruptedException {
		ExecutorService service = null;
		try {
			service = Executors.newSingleThreadExecutor();
			for (int i = 0; i < 100; i++) {
				service.execute(() -> {
					sheepCount1.getAndIncrement();
					sheepCount2++;
				});
			}
			Thread.sleep(100);
			System.out.println(sheepCount1 + " " + sheepCount2);
		} finally {
			if (service != null)
				service.shutdown();
		}
	}
}
