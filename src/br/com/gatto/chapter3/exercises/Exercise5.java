package br.com.gatto.chapter3.exercises;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Vector;


/**
 * Exercise 5
 * Explanation:
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
