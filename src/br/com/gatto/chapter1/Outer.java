package br.com.gatto.chapter1;

/**
 * Member inner class rules:
 * 1- Can be declared as public, private, protected or use default access.
 * 2- Can extend anyclass and implements any interface
 * 3- Can be abstract and final
 * 4- Cannot declare static fields and methods
 * 5- Can access members of the outer class including private members.
 */
public class Outer {
	private String greeting = "Hi";

	protected class Inner {
		public int repeat = 3;

		public void go() {
			for (int i = 0; i < repeat; i++) {
				System.out.println(greeting);
			}
		}
	}

	public void callInner() {
		Inner inner = new Inner();
		inner.go();
	}

	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.callInner();
		
		Inner inner = outer.new Inner();
	}
}
