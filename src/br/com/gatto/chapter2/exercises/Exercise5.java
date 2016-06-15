package br.com.gatto.chapter2.exercises;


/**
 * Exercise 5
 * Explanation: 
 */
public class Exercise5 {
	private static volatile Exercise5 instance;

	private Exercise5() {
	}

	public static Exercise5 getInstance() {
		synchronized (Exercise5.class) {
			if (instance == null)
				instance = new Exercise5();
		}
		return instance;
	}
}
