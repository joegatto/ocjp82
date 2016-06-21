package br.com.gatto.chapter3;

import java.util.Arrays;
import java.util.List;

public class UpdatingAllElements {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3);
		list.replaceAll(x -> x * 2);
		System.out.println(list);
	}
}
