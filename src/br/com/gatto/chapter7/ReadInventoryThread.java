package br.com.gatto.chapter7;

public class ReadInventoryThread extends Thread {
	public static void main(String[] args) {
		new ReadInventoryThread().start();
	}

	@Override
	public void run() {
		System.out.println("Printing zoo inventory");
	}
}
