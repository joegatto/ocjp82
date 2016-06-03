package br.com.gatto.assessment;

/**
 * This class is a proper use of generics. Box uses a generic type named T. On
 * line 11, the generic type is String. On line 12 the generic type is Integer.
 * Line 12 also uses the diamond operator.
 */
public class Box<T> {
	T value;

	public Box(T value) {
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	public static void main(String[] args) {
		Box<String> one = new Box<String>("a string");
		Box<Integer> two = new Box<>(123);
		System.out.print(one.getValue());
		System.out.print(two.getValue());
	}

}
