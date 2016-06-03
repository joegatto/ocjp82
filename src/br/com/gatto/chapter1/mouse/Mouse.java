package br.com.gatto.chapter1.mouse;

import br.com.gatto.chapter1.cat.BigCat;

public class Mouse {
	public static void main(String[] args) {
		// Here only the variable marked as public is available, all others
		// cannot be used because this class is not in the same package as
		// BigCat class.
		BigCat cat = new BigCat();
		System.out.println(cat.name);
		// System.out.println(cat.hasFur);
		// System.out.println(cat.hasPaws);
		// System.out.println(cat.id);
	}
}
