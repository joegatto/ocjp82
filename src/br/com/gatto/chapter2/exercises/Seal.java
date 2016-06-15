package br.com.gatto.chapter2.exercises;

import java.util.List;

/**
 * Exercise 7 
 * Explanation: C, E, G, H. A is incorrect, as there are definitely
 * some problems with the immutable objects implementation. B is incorrect, as
 * there is no such thing as the Immutable interface defined in the Java API. C
 * is correct, as all instance variables should be private and final to prevent
 * them from being changed by a caller. D is incorrect, as adding settings is
 * the opposite of what you do with the immutable object pattern. E is correct,
 * since List<Seal> is mutable, all direct access should be removed. F is
 * incorrect, as this has nothing to do with immutability. G is correct, as we
 * need to copy the mutable List<Seal> to prevent the caller of the constructor
 * from maintaining access to a mutable structure within our class. H is also
 * correct, as it prevents the methods of the class from being overridden.
 */
public class Seal {
	String name;
	private final List<Seal> friends;

	public Seal(String name, List<Seal> friends) {
		this.name = name;
		this.friends = friends;
	}

	public String name() {
		return name;
	}

	public List<Seal> getFriends() {
		return friends;
	}
}
