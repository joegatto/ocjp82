package br.com.gatto.chapter3;

import java.util.ArrayList;
import java.util.List;

public class UpperBoundedWildcard {

	public class Sparrow extends Bird {
	}

	public class Bird {
	}

	public static void main(String[] args) {
		List<? extends Number> list = new ArrayList<Integer>();

		List<Double> list2 = new ArrayList<>();
		list2.add(42.5);
		list2.add(42.0);
		System.out.println(total(list2));
		
		List<? extends Bird> birds = new ArrayList<Bird>();
		// list.add(new Sparrow());
		// list.add(new Bird());
	}

	public static double total(List<? extends Number> list) {
		double count = 0;
		for (Number number : list) {
			count += number.doubleValue();
		}
		return count;
	}
}
