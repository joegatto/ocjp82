package br.com.gatto.chapter1.exercises;

/**
 * Exercise 16 
 * Explanation:
 */
public class Outer3 {

	class Inner {
	}

	public static void main(String[] args) {
		// Inner in1 = new Inner();
		// Inner in2 = Outer.new Inner();
		// Outer.Inner in3 = new Outer().Inner();
		Outer.Inner in4 = new Outer().new Inner();
		// Outer.Inner in5 = Outer.new Inner();
	}
}
