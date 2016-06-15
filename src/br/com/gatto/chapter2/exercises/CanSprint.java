package br.com.gatto.chapter2.exercises;

/**
 * Exercise 10 
 * Explanation: D. While Java supports multiple inheritance through
 * interfaces, it does not support method overriding in interfaces, since it’s
 * not clear which parent method should be used. In this example, CanWalk and
 * CanRun both implement a default walk() method. The definition of CanSprint
 * extends these two interfaces and therefore won’t compile as two default
 * methods with the same signature from parent classes are detected, therefore
 * the answer is D. None of the other lines of code cause problems, so the rest
 * of the answers are not correct.
 */
public interface CanSprint extends CanWalk, CanRun {
	@Override
	default void walk() {
		CanRun.super.walk();
	}
}
