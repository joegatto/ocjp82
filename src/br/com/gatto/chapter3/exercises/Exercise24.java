package br.com.gatto.chapter3.exercises;

import java.util.HashSet;
import java.util.Set;

/**
 * Exercise 24 
 * Explanation: F. Choice A is incorrect because forEach takes a
 * Consumer parameter, which requires one parameter. Choices B and C are close.
 * The syntax for a lambda is correct. However, s is already defined as a local
 * variable and therefore the lambda can’t redefine it. Choices D and E use
 * incorrect syntax for a method reference. Choice F is correct.
 */
public class Exercise24 {
	public static void main(String[] args) {
		Set<String> s = new HashSet<>();
		s.add("lion");
		s.add("tiger");
		s.add("bear");
//		s.forEach(() -> System.out.println(s));
//		s.forEach(s -> System.out.println(s));
//		s.forEach((s) -> System.out.println(s));
//		s.forEach(System.out.println(s));
//		s.forEach(System:out:println);
		s.forEach(System.out::println);
		
	}
}
