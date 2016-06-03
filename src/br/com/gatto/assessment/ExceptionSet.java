package br.com.gatto.assessment;

import java.util.HashSet;
import java.util.Set;

public class ExceptionSet {
	public static void main(String[] args) {
		Set<? extends RuntimeException> set1 = new HashSet<NullPointerException>();
		Set<? extends RuntimeException> set2 = new HashSet<RuntimeException>();
	}
}
