package br.com.gatto.chapter1;

import java.sql.SQLException;

public class BobcatKitten extends Bobcat {

	/**
	 * Overriding rules:
	 * 1- The access modifier must be the same or more accessible.
	 * 2- The return type must be the same or a more restrictive type, covariant return type.
	 * 3- If any checked exceptions are thrown, only the same exceptions or subclasses are allowed to be thrown. 
	 */
	public void findDen() throws SQLException {

	}

	// protected void findDen() {
	//
	// }

	// void findDen() {
	//
	// }

	/**
	 * Overload priority: 
	 * 1- Exact match by type. 
	 * 2- Matching a superclass type.
	 * 3- Converting to a larger primitive type. 
	 * 4- Converting to an autoboxed type. 
	 * 5- Varargs.
	 */
	public void findDen(int b) { // 1
		System.out.println("In int....");
	}

	public void findDen(Integer b) { // 2
		System.out.println("In Integer....");
	}

	public void findDen(long b) { // 3
		System.out.println("In long....");
	}

	public void findDen(Object b) { // 4
		System.out.println("In Object....");
	}

	public void findDen(int... b) { // 5
		System.out.println("In Varargs Int....");
	}

	public int findden() throws Exception {
		return 0;
	}

	public static void main(String[] args) {
		BobcatKitten bk = new BobcatKitten();
		bk.findDen(1); // In int....
		bk.findDen(2); // When method 1 is commented, the result is In long....
		bk.findDen(3); // When method 1,3 are commented, the result is In
						// Integer...
		bk.findDen(new Integer(4)); // In Integer....
		bk.findDen(5L); // In Long....
		bk.findDen(new Integer(6)); // When method 1, 2, 3, 4 are commented, the
									// result is In Varargs Int....
		bk.findDen(7, 8); // In Varargs Int....
	}
}
