package br.com.gatto.chapter3;

import java.util.ArrayList;
import java.util.List;

public class LegacyUnicorn {
	public static void main(String[] args) {
		List<Unicorn> unicorns = new ArrayList<>();
		addUnicorn(unicorns);
		Unicorn unicorn = unicorns.get(0);
	}

	private static void addUnicorn(List unicorns) {
		unicorns.add(new Dragon());
	}
}
