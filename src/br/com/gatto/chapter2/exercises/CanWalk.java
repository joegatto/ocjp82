package br.com.gatto.chapter2.exercises;

public interface CanWalk {
	default void walk() {
		System.out.println("Walking");
	}
}
