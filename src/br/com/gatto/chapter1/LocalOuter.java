package br.com.gatto.chapter1;

/**
 * Local inner class is defined within a method:
 * 1- Don't have an access specifier.
 * 2- Cannot be declared as static or declare static fields or methods.
 * 3- Have access to all fields and methods of the enclosing class.
 * 4- Have no access to local variables UNLESS those variables are final or effectively final.
 */
public class LocalOuter {
	private int length = 5;

	public void calculate() {
		final int width = 20;

		class LocalInner {
			public void multiply() {
				System.out.println(length * width);
			}
		}

		LocalInner inner = new LocalInner();
		inner.multiply();
	}
	
	public void isItFinal() {
		int one = 20;
		int two = one;
		two++;
		int three;
		if (one == 4)
			three = 3;
		else
			three = 4;
		int four = 4;
		class Inner {
			public void test() {
				System.out.println(one); // It's effectively final because is assigned only once.
				// System.out.println(two); // It isn't effectively final because value is changed. 
				System.out.println(three); // It's effectively final because three is assigned only once, even being assigned in the if statement.
				// System.out.println(four); // It isn't effectevily final because four is being changed, even being changed after the inner class. 
			}
		}
		four = 5;
	}

	public static void main(String[] args) {
		LocalOuter outer = new LocalOuter();
		outer.calculate();
	}
}
