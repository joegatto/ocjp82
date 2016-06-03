package br.com.gatto.assessment;

/**
 * The code compiles. An enum may be an inner class. The values() method returns
 * an array with the enum values in the order in which they were declared in the
 * code. Since Java uses 0-based indexes, the answer is A.
 *
 */
public class VisitPark {
	enum AnimalsInPark {
		SQUIRREL, CHIPMUNK, SPARROW;
	}

	public static void main(String[] args) {
		AnimalsInPark[] animals = AnimalsInPark.values();
		System.out.println(animals[1]);
	}
}
