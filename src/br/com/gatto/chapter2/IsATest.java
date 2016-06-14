package br.com.gatto.chapter2;

public class IsATest {
	public static void main(String[] args) {

		// When you are going up the hierarchy tree, there is no need for
		// casting.
		Cat cat = new Cat();
		Feline feline = cat;
		Animal animal = cat;
		Pet pet = cat;

		// When you are going down the hierarchy tree, you need to do the
		// casting.
		feline = (Feline) animal;

		// Be careful when the object is not from the same hierarchy of the
		// object created.
		// Ocelot ocelot = (Ocelot) feline; // CLASS CAST EXCEPTION
		// Dog dog = (Dog) pet;
	}
}
