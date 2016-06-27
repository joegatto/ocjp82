package br.com.gatto.chapter4;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class CheckingFunctionalInterfaces {
	public static void main(String[] args) {
		Predicate<List> ex1 = x -> "".equals(x.get(0));
		Consumer<Long> ex2 = (Long l) -> System.out.println(l);
		BiPredicate<String, String> ex3 = (s1, s2) -> false;

		// Function<List<String>> ex4 = x -> x.get(0); // DOES NOT COMPILE - Function needs to specify two generics method
		// UnaryOperator<Long> ex5 = (Long l) -> 3.14; // DOES NOT COMPILE - Unary expect Long to be returned in the lambda, but it's currently returning a double 
		// Predicate ex6 = String::isEmpty; // DOES NOT COMPILE - Missing generic type, so the object being passes as a parameter is an Object.
	}
}
