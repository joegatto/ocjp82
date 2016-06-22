package br.com.gatto.chapter3.exercises;


/**
 * Exercise 6 
 * Explanation: C. Line 7 gives a compiler warning for not using
 * generics but not a compiler error. Line 4 compiles fine because toString() is
 * defined on the Object class and is therefore always available to call. Line 6
 * creates the Hello class with the generic type String. Line 7 creates the
 * Hello class with the generic type Object since no type is specified.
 */
public class Hello<T> {
	T t;

	public Hello(T t) {
		this.t = t;
	}
	
	@Override
	public String toString() {
		return t.toString();
	}
	
	public static void main(String[] args) {
		System.out.print(new Hello<String>("hi"));
		System.out.print(new Hello("there"));
		System.out.print(new Hello<Integer>(1));
		System.out.print(new Hello(1));
	}
}
