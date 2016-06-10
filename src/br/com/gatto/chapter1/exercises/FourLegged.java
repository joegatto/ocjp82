package br.com.gatto.chapter1.exercises;

/**
 * Exercise 20
 * Explanation:
 */
public class FourLegged {
	String walk = "walk,";
	
	static class BabyRhino extends FourLegged {
		String walk = "toodle,";
	}
	
	public static void main(String[] args) {
		FourLegged f = new FourLegged();
		BabyRhino b = new BabyRhino();
		System.out.println(f.walk);
		System.out.println(b.walk);
	}
}
