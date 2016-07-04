package br.com.gatto.chapter7.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Exercise 7 
 * Explanation: A. The code compiles without issue, so D is
 * incorrect. The CopyOnWriteArrrayList class is designed to preserve the
 * original list on iteration, so the first loop will be executed exactly three
 * times and E is incorrect. The ConcurrentSkipListSet class allows
 * modifications while iterating, so it is possible that the second loop could
 * generate an infinite loop. In this case, though, the second loop executes
 * exactly four times, since elements in a set are unique and 5 can be added
 * only once. For these reasons, F and G are also incorrect. Finally, despite
 * using the elements of l1 to populate the collections, l2 and s3 are not
 * backed by the original list, so the size of l1 is 3. Likewise, the size of l2
 * is 6 and the size of s3 is 4, so A is the correct answer.
 */
public class Exercise7 {
	public static void main(String[] args) {
		List<Integer> l1 = Arrays.asList(1, 2, 3);
		List<Integer> l2 = new CopyOnWriteArrayList<>(l1);
		Set<Integer> s3 = new ConcurrentSkipListSet<>();
		s3.addAll(l1);

		for (Integer item : l2) {
			l2.add(4);
		}
		for (Integer item : s3) {
			s3.add(5);
		}
		System.out.println(l1.size() + " " + l2.size() + " " + s3.size());
	}
}
