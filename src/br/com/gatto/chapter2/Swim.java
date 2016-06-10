package br.com.gatto.chapter2;

public interface Swim {
	public default void test(){
		System.out.println("Teste");
	}
}
