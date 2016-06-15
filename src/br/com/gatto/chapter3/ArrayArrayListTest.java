package br.com.gatto.chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayArrayListTest {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Fluffy");
		list.add("Webby");

		String[] array = new String[list.size()];
		array[0] = list.get(0);
		array[1] = list.get(1);

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + "-");
		}

		String[] array2 = { "gerbil", "mouse" };
		System.out.println(arrayToString(array2));
		List<String> list2 = Arrays.asList(array2);
		System.out.println(arrayToString(array2));
		System.out.println(list2);
		list2.set(1, "test");
		System.out.println("After list2.set ************************");
		System.out.println(arrayToString(array2));
		System.out.println(list2);
		array2[0] = "new";
		System.out.println("After array[0] ************************");
		System.out.println(arrayToString(array2));
		System.out.println(list2);
		String[] array3 = (String[]) list2.toArray();
		System.out.println("After array3 creation ************************");
		System.out.println(arrayToString(array3));
		System.out.println(arrayToString(array2));
		System.out.println(list2);
		// list2.remove(1);
		// System.out.println("After remove creation ************************");
		// System.out.println(arrayToString(array3));
		// System.out.println(arrayToString(array2));
		// System.out.println(list2);
		array3[0] = "xurupita";
		System.out.println("After array3[0] ************************");
		System.out.println(arrayToString(array3));
		System.out.println(arrayToString(array2));
		System.out.println(list2);
		list2.set(0, "xurupita");
		System.out.println("After set ************************");
		System.out.println(arrayToString(array3));
		System.out.println(arrayToString(array2));
		System.out.println(list2);

		int[] numbers = { 6, 9, 1, 8 };
		Arrays.sort(numbers);
		System.out.println(Arrays.binarySearch(numbers, 6));
		System.out.println(Arrays.binarySearch(numbers, 3));
		
		List<Integer> list3 = Arrays.asList(9,7,5,3);
		Collections.sort(list3);
		System.out.println(Collections.binarySearch(list3, 3));
		System.out.println(Collections.binarySearch(list3, 2));
	}

	private static String arrayToString(String[] array) {
		String values = "[";
		for (int i = 0; i < array.length; i++) {
			if (i != 0)
				values += ", ";
			values += array[i];
		}
		return values + "]";
	}
}
