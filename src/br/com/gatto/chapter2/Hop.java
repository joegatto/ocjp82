package br.com.gatto.chapter2;

public interface Hop {
	public default void test() {
		System.out.println("Teste");
	}
}
