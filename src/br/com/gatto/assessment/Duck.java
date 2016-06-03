package br.com.gatto.assessment;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * A is incorrect, since there are definitely some problems with the immutable
 * objects implementation. B is correct, because all instance variables should
 * be marked final and private for the class to be considered immutable. C is
 * correct, because it prevents the methods from being overridden. D is
 * incorrect, since there is no such thing as the Immutable interface defined in
 * the Java API. E is also incorrect, because any passed lambda expression would
 * have access to only the public methods of the class. F is correct, because
 * the mutable object ducklings should not be exposed directly, since this
 * allows the user to modify it. G is incorrect, because this has nothing to do
 * with immutability.
 */
public class Duck {
	private String name;
	private List<Duck> ducklings;

	public Duck(String name, List<Duck> ducklings) {
		this.name = name;
		this.ducklings = new ArrayList<Duck>(ducklings);
	}

	public String getName() {
		return name;
	}

	public List<Duck> getDucklings() {
		return ducklings;
	}

	public String hasDuckling(Predicate<Duck> p) {
		return p.test(this) ? "Quack Quack" : " ";
	}
}
