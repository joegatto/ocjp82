package br.com.gatto.chapter3;

public class LegacyDuck implements Comparable {
	private String name;

	@Override
	public int compareTo(Object o) {
		LegacyDuck d = (LegacyDuck) o;
		return name.compareTo(d.name);
	}
	
	
}
