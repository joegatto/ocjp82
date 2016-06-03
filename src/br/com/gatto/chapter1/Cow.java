package br.com.gatto.chapter1;

public class Cow extends Animal {
	private void addHay() {

	}

	@Override
	public void feed() {
		addHay();
	}
}
