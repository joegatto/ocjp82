package br.com.gatto.chapter1.exercises;

/**
 * Exercise 9
 * Explanation:
 */
public class Outer2 {
	private int x = 24;
	
	public int getX(){
		String message = "X is ";
		class Inner2 {
//			private int x  = Outer.this.x;
			
			public void printX(){
				System.out.println(message + x);
			}
		}
		Inner2 in = new Inner2();
		in.printX();
		return x;
	}
	
	public static void main(String[] args) {
		new Outer2().getX();
	}
}
