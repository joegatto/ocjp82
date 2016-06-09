package br.com.gatto.chapter1;

public class Enclosing {
	public int test = 1;

	static class Nested {
		private int price = 6;

		static void test() {
		}
	}

	public static void main(String[] args) {
		Nested nested = new Nested();
		System.out.println(nested.price);
	}
}
