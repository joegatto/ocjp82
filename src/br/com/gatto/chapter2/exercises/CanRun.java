package br.com.gatto.chapter2.exercises;

public interface CanRun {
	public default void walk() {
		System.out.println("Walking");
	}
}
