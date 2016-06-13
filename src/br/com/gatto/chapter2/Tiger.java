package br.com.gatto.chapter2;

public class Tiger implements Sprint {

	@Override
	public void sprint(Animal animal) {
		System.out.println("Animal is sprinting fast!" + animal.toString());
	}

}
