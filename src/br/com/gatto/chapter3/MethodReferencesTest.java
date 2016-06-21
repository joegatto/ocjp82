package br.com.gatto.chapter3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MethodReferencesTest {
	
	public static void main(String[] args) {
		Comparator<Duck> c = (d1, d2) -> DuckHelper.compareByName(d1, d2);
		Comparator<Duck> c2 = DuckHelper::compareByName;
		Comparator<Duck> c3 = DuckHelper::compareByWeight;

		Consumer<List<Integer>> methodRef1 = Collections::sort;
		Consumer<List<Integer>> lambda1 = l -> Collections.sort(l);

		String str = "abc";
		Predicate<String> methodRef2 = str::startsWith;
		Predicate<String> lambda2 = s -> str.startsWith(s);

		Predicate<String> methodRef3 = String::isEmpty;
		Predicate<String> lambda3 = s -> s.isEmpty();

		Supplier<ArrayList> methodRef4 = ArrayList::new;
		Supplier<ArrayList> lambda4 = () -> new ArrayList();

	}
}
