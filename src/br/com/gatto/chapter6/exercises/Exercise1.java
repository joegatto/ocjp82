package br.com.gatto.chapter6.exercises;

import java.sql.SQLException;

/**
 * Exercise 1 
 * Explanation: C. The method should declare that it throws an
 * exception and the body of the method actually would throw it. Options E and F
 * are incorrect because both checked and unchecked (runtime) exceptions can be
 * declared in a method signature. Also, option F is incorrect because
 * SQLException is a checked exception.
 */
public class Exercise1 {
	public void read() throws SQLException {
		throw new SQLException();
	}
}
