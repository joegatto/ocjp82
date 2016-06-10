package br.com.gatto.chapter1.exercises;

import java.util.ArrayList;

/**
 * Exercise 14 
 * Explanation:
 */
public class IsItFurry2 {
	static interface Mammal {

	}

	static class Furry implements Mammal {

	}

	static class Chipmunk extends Furry {

	}

	public static void main(String[] args) {
		Chipmunk c = new Chipmunk();
		ArrayList<Chipmunk> l = new ArrayList<>();
		Runnable r = new Thread();
		int result = 0;
		if (c instanceof Chipmunk)
			result += 1;
//		if (l instanceof Chipmunk)
//			result += 2;
		if (r instanceof Chipmunk)
			result += 4;
		System.out.println(result);
	}
}
