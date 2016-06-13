package br.com.gatto.chapter2;

import java.util.function.Predicate;

public class FindMatchingAnimals {

	private static void print(Animal animal, Predicate<Animal> trait) {
		if (trait.test(animal)) {
			System.out.println(animal);
		}
	}

	public static void main(String[] args) {
		print(new Animal("fish", false, true), a -> a.canHop());
		print(new Animal("kangaroo", true, false), a -> a.canHop());
		print(new Animal("dog", true, false), a -> {
			return a.canHop();
		});
		print(new Animal("cat", true, false), (a) -> {
			return a.canHop();
		});
		print(new Animal("monkey", true, false), (Animal a) -> {
			return a.canHop();
		});
	}
}
