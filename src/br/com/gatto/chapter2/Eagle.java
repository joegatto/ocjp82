package br.com.gatto.chapter2;

public class Eagle implements Fly {

	public int getWingSpan() {
		return 15;
	}

	public void land() {
		System.out.println("Eagle is diving fast");
	}

}
