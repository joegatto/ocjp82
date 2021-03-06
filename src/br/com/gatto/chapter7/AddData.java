package br.com.gatto.chapter7;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Stream;

public class AddData {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService service = null;
		try {
			service = Executors.newSingleThreadExecutor();
			Future<Integer> result = service.submit(() -> 30 + 11);
			System.out.println(result.get());

			service.submit(() -> {
				Thread.sleep(1000);
				return null;
			});

			// service.submit(() -> {
			// Thread.sleep(1000);
			// });
		} finally {
			if (service != null)
				service.shutdown();
		}
	}
}
