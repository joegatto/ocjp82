package br.com.gatto.chapter1;

public class Wolf extends Animal {

	String name = "Leo";

	private void addMeat() {

	}

	public void play() {
		System.out.println("toss in meat");
	}

	@Override
	public void feed() {
		addMeat();
	}
}
