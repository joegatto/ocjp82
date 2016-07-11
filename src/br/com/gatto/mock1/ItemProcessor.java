package br.com.gatto.mock1;

import java.util.concurrent.CyclicBarrier;

public class ItemProcessor extends Thread {
	CyclicBarrier cb;

	public ItemProcessor(CyclicBarrier cb) {
		this.cb = cb;
	}

	public void run() {
		System.out.println("processed");
		try {
			cb.await();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
