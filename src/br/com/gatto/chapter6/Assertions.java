package br.com.gatto.chapter6;

public class Assertions {
	public static void main(String[] args) {
		int numGuests = -5;
		assert numGuests > 0;
		System.out.println(numGuests);
	}
}
