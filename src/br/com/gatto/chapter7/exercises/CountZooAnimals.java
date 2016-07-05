package br.com.gatto.chapter7.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.IntStream;

/**
 * Exercise 21 
 * Explanation: A, C, D, E. The code compiles and runs without
 * issue, so G and H are incorrect. The return type of performCount() is
 * Integer, so the submit() is interpreted as being applied to a Callable
 * <Integer> value. In this manner, the Future<?> is really a Future
 * <Integer> object. One possible implementation of performCount() is just to
 * return the input parameter; therefore A is a correct answer. B is incorrect,
 * because the return type is Integer, not Boolean. The performCount() method
 * could just return null, so C is a correct choice. The performCount() can also
 * throw a runtime exception; therefore D is also a correct answer. It is also
 * possible for our performCount() to hang indefinitely, such as in a deadlock.
 * This would cause Future.get() to hang in printResults(), making E also a
 * correct answer. Finally, any exception thrown in performCount() will appear
 * as an exception in the get() operation. Since the get() operations are caught
 * in a try/catch block in printResults(), none of them will be unhandled, and F
 * is incorrect.
 */
public class CountZooAnimals {
	public static Integer performCount(int exhibitNumber) {
		return exhibitNumber;
	}

	public static void printResults(Future<?> f) {
		try {
			System.out.println(f.get());
		} catch (Exception e) {
			System.out.println("Exception");
		}
	}

	public static void main(String[] args) {
		ExecutorService service = Executors.newSingleThreadExecutor();
		final List<Future<?>> results = new ArrayList<>();
		IntStream.range(0, 10).forEach(i -> results.add(service.submit(() -> performCount(i))));
		results.stream().forEach(f -> printResults(f));
		service.shutdown();
	}
}
