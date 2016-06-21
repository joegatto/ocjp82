package br.com.gatto.chapter3.exercises;


/**
 * Exercise 5
 * Explanation: 
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
