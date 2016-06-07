package br.com.gatto.chapter1;

public enum OnlyOne {
	ONCE(true);

	private OnlyOne(boolean b) {
		System.out.println("Constructing");
	}

	public static void main(String[] args) {
		OnlyOne firstCall = OnlyOne.ONCE;
		OnlyOne secondCall = OnlyOne.ONCE;
	}
}
