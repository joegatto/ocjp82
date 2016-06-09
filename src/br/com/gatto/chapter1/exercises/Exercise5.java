package br.com.gatto.chapter1.exercises;

/**
 * Exercise 5 
 * Explanation:
 */
public class Exercise5 {
	public static void main(String[] args) {
		String a = new String("a");
		String b = new String("a");

		System.out.println(a.equals(b));
		System.out.println(a.hashCode() == b.hashCode());
		
		System.out.println("******************************");
		
		a = new String("a");
		b = new String("b");

		System.out.println(a.equals(b));
		System.out.println(a.hashCode() == b.hashCode());
	}
}
