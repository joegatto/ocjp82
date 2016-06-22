package br.com.gatto.chapter3.exercises;

/**
 * Exercise 17 
 * Explanation: B, D. Line 1 is a generic class that requires
 * specifying a name for the type. Options A and C are incorrect because no type
 * is specified. Line 3 tries to use the diamond operator to instantiate the
 * class. Option E is incorrect because T is not a class and certainly not one
 * compatible with String. Option F is incorrect because a wildcard cannot be
 * specified on the right side when instantiating an object.
 */
public class Generic<T> {
	public static void main(String[] args) {
		Generic<String> g = new Generic<>();
		Generic<Object> g2 = new Generic();
	}
}
