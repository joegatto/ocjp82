package br.com.gatto.chapter1.exercises;


/**
 * Exercise 7
 * Explanation:
 */
public class IceCream {
	enum Flavors {
		VANILLA, CHOCOLATE, STRAWBERRY
	}
	
	public static void main(String[] args) {
		Flavors f = Flavors.STRAWBERRY;
		switch (f) {
//		case 0:
//			System.out.println("Vanilla");
//			break;
//		case 1:
//			System.out.println("Chocolate");
//			break;
//		case 2:
//			System.out.println("Strawberry");
//			break;
		default:
			System.out.println("Missing flavor");
		}
	}
}
