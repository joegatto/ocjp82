package br.com.gatto.assessment;

/**
 * The code compiles due to autoboxing. The command line does not enable
 * assertions, so D cannot happen. Line 6 executes and prints out 11, so the
 * answer is F.
 *
 */
public class AssertDemo {
	public static void main(String[] args) {
		Integer x = 10;
		x++;
		assert x == null && x >= 0;
		System.out.println(x);
	}
}
