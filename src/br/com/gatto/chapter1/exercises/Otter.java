package br.com.gatto.chapter1.exercises;

public interface Otter {
	default void play() {
		
	}
}

/**
 * Exercise 21
 * Explanation:
 */
class RiverOtter implements Otter {
	@Override
	public boolean equals(Object obj) {
		return false;
	}
	
	@Override
	public int hashCode() {
		return 42;
	}
	
	@Override
	public void play() {

	}
	
}
