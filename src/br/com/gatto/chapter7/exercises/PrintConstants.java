package br.com.gatto.chapter7.exercises;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.DoubleStream;

/**
 * Exercise 16 
 * Explanation: F, H. The application compiles and does not throw an
 * exception, so B, C, D, E, and G are incorrect. Even though the stream is
 * processed in sequential order, the tasks are submitted to a thread executor,
 * which may complete the tasks in any order. Therefore, the output cannot be
 * determined ahead of time and F is correct, making A incorrect. Finally, the
 * thread executor is never shut down; therefore the code will run but it will
 * never terminate, making H also correct.
 */
public class PrintConstants {
	public static void main(String[] args) {
		ExecutorService service = Executors.newScheduledThreadPool(10);
		DoubleStream.of(3.14159, 2.71828).forEach(c -> service.submit(() -> System.out.println(10 * c)));
		service.execute(() -> System.out.println("Printed"));
	}
}
