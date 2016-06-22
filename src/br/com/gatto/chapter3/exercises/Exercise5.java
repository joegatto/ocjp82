package br.com.gatto.chapter3.exercises;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Vector;


/**
 * Exercise 5 
 * Explanation: B, C, F. Option A does not compile because the
 * generic types are not compatible. We could say HashSet<? extends Number> hs2
 * = new HashSet<Integer>();. Option B uses a lower bound, so it allows
 * superclass generic types. Option C is a traditional use of generics where the
 * generic type is the same and the List type uses the interface as the type.
 * Option D does not compile because a Set is not a List. Option E does not
 * compile because upper bounds are not allowed when instantiating the type.
 * Finally, Option F does compile because the upper bound is on the correct side
 * of =.
 */
public class Exercise5 {
	public static void main(String[] args) {
		// HashSet<Number> hs = new HashSet<Integer>();
		HashSet<? super ClassCastException> set = new HashSet<Exception>();
		List<String> list = new Vector<String>();
		// List<Object> values = new HashSet<Object>();
		// List<Object> objects = new ArrayList<? extends Object>();
		Map<String, ? extends Number> hm = new HashMap<String, Integer>();
	}
}
