package br.com.gatto.chapter1.exercises;

/**
 * Exercise 17
 * Explanation:
 */
public enum AnimalClasses {

	MAMMAL(true), FISH(Boolean.FALSE), BIRD(false), 
	REPTILE(false), AMPHIBIAN(false), INVERTEBRATE(false); // When we have more code in a ENUM we should finish the declaration with a semicolon.

	boolean hasHair;

	private AnimalClasses(boolean hasHair) { // All enum constructors MUST be PRIVATE.
		this.hasHair = hasHair;
	}
	
	public boolean hasHair(){
		return hasHair;
	}
	
	public void giveWig() {
		hasHair = true;
	}
}
