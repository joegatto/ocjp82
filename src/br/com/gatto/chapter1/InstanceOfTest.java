package br.com.gatto.chapter1;

public class InstanceOfTest {
	public static void main(String[] args) {
		HeavyAnimal hippo = new Hippo();
		System.out.println(hippo instanceof Hippo); // true
		System.out.println(hippo instanceof HeavyAnimal); // true
		System.out.println(hippo instanceof Elephant); // false
		System.out.println(hippo instanceof Object); // true

		System.out.println("***********");

		Hippo nullHippo = null;
		System.out.println(nullHippo instanceof Object); // false

		Hippo anotherHippo = new Hippo();
		// System.out.println(anotherHippo instanceof Elephant); // Compilation
		// error, there is no way to Hippo to be a an Elephant.

		HeavyAnimal hippo2 = new Hippo();
		System.out.println(hippo2 instanceof Mother);

		System.out.println("***********");

		HeavyAnimal motherHippo = new MotherHippo();
		System.out.println(motherHippo instanceof Hippo); // true
		System.out.println(motherHippo instanceof HeavyAnimal); // true
		System.out.println(motherHippo instanceof Elephant); // false
		System.out.println(motherHippo instanceof Object); // true
		System.out.println(motherHippo instanceof Mother); // true
	}

//	public void feedAnimal(Animal animal) {
//		if (animal instanceof Cow) {
//			((Cow) animal).addHay();
//		} else if (animal instanceof Bird) {
//			((Bird) animal).addSeed();
//		} else if (animal instanceof Wolf) {
//			((Wolf) animal).addMeat();
//		} else {
//			throw new RuntimeException("Unsupported Animal");
//		}
//	}
	
	public void feedAnimal(Animal animal) {
		animal.feed();
	}
}
