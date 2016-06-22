package br.com.gatto.chapter3.exercises;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector;


/**
 * Exercise 13 
 * Explanation: B, E. showSize() can take any type of List since
 * it uses an unbounded wildcard. Option A is incorrect because it is a Queue
 * and not a List. Option C is incorrect because the wildcard is not allowed to
 * be on the right side of an assignment. Option D is incorrect because the
 * generic types are not compatible. Option B is correct because a lower-bounded
 * wildcard allows that same type to be the generic. Option E is correct because
 * Integer is a subclass of Number. Vector is an old type of List. It isn’t
 * common in new code, but you still need to know it for the exam and in case
 * you encounter old code.
 */
public class Wildcard {
	public void showSize(List<?> list) {
		System.out.println(list.size());
	}

	public static void main(String[] args) {
		Wildcard card = new Wildcard();
		// ArrayDeque<?> list = new ArrayDeque<String>();
		ArrayList<? extends Date> list1 = new ArrayList<>();
		card.showSize(list1);
		// List<?> list = new ArrayList<?>();
		// List<Exception> list = new LinkedList<IOException>();
		Vector<? extends Number> list2 = new Vector<Integer>();
		card.showSize(list2);
	}
}
