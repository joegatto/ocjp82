package br.com.gatto.mock1;

import java.util.Arrays;
import java.util.List;

public class Exercise21 {
	public static void main(String[] args) {
		List<Integer> ls = Arrays.asList(11, 11, 22, 33, 33, 55, 66);
		// ls.stream().anyMatch(44);
		// ls.stream().anyMatch(11);
		ls.stream().distinct().anyMatch(x -> x == 11);
		// ls.stream().allMatch(11);
		ls.stream().noneMatch(x -> x % 11 > 0);
	}
}
