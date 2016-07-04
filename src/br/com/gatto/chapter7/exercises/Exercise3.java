package br.com.gatto.chapter7.exercises;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


/**
 * Exercise 3
 * Explanation: B, C. The code does not compile, so A and F are
 * incorrect. The first problem is that although a ScheduledExecutorService is
 * created, it is assigned to an ExecutorService. Since scheduleWithFixedDelay()
 * does not exist in ExecutorService, line w1 will not compile, and B is
 * correct. The second problem is that scheduleWithFixedDelay()supports only
 * Runnable, not Callable, and any attempt to return a value is invalid in a
 * Runnable lambda expression; therefore line w2 will also not compile and C is
 * correct. The rest of the lines compile without issue, so D and E are
 * incorrect.
 */
public class Exercise3 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
		service.scheduleWithFixedDelay(() -> { // w1
			System.out.println("Open Zoo");
		}, 0, 1, TimeUnit.MINUTES);
		Future<?> result = service.submit(() -> System.out.println("Wake Staff")); // w3
		System.out.println(result.get()); //w4
	}
}
