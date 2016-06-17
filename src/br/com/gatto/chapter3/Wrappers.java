package br.com.gatto.chapter3;

import java.util.ArrayList;
import java.util.List;

public class Wrappers {
	Boolean bool = new Boolean(true);
	Byte bytes = new Byte((byte) 1);
	Short shorts = new Short((short) 1);
	Integer integers = new Integer(1);
	Long longs = new Long(1);
	Float floats = new Float(1.0f);
	Float floats2 = new Float(1.0d);
	Double doubles = new Double(1.0);
	Character character = new Character('c');

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(new Integer(3));
		numbers.add(new Integer(5));
		numbers.remove(1);
		numbers.remove(new Integer(5));
		System.out.println(numbers);

		int num = numbers.get(0);
	}
}
