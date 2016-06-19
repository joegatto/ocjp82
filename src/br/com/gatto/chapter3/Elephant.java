package br.com.gatto.chapter3;

public class Elephant {
	public static void main(String[] args) {
		Elephant elephant = new Elephant();
		Crate<Elephant> crateForElephant = new Crate<>();
		crateForElephant.packCrate(elephant);
		Elephant inNewHome = crateForElephant.emptyCrate();

		Integer numPounds = 15_000;
		SizeLimitedCrate<Elephant, Integer> c1 = new SizeLimitedCrate<Elephant, Integer>(elephant, numPounds);

		Crate<Elephant> elephant2 = Crate.<Elephant>ship(elephant);
		System.out.println(elephant2);
	}
}
