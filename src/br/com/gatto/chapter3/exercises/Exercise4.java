package br.com.gatto.chapter3.exercises;

import java.util.ArrayDeque;


/**
 * Exercise 4
 * Explanation:
 */
public class Exercise4 {
	public static void main(String[] args) {
		ArrayDeque<String> greetings = new ArrayDeque<String>();
		greetings.push("hello");
		greetings.push("hi");
		greetings.push("ola");
		greetings.pop();
		greetings.peek();
		while (greetings.peek() != null) {
			System.out.print(greetings.pop());
		}
	}
}
