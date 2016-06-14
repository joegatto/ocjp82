package br.com.gatto.chapter2;

public class Fish extends Food {

	public Fish(int quantity) {
		super(quantity);
	}

	@Override
	public void consumed() {
		System.out.println("Fish eaten: " + getQuantity());
	}

}
