package br.com.gatto.mock1;

import java.util.concurrent.CyclicBarrier;

public class Exercise32 {
	public static void main(String[] args) throws Exception {
		Merger m = new Merger();

		CyclicBarrier cb = new CyclicBarrier(2, m);

		ItemProcessor ip = new ItemProcessor(cb);
		ip.start();
		cb.await();
	}
}
