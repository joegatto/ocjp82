package br.com.gatto.chapter1.species;

import br.com.gatto.chapter1.cat.BigCat;

public class Lynx extends BigCat {
	public static void main(String[] args) {
		// Here only name is available becuase it's the only variable marked as
		// public, even Lynx extending BigCat hasFur cannot be used because we
		// are using a BigCat variable type.
		BigCat cat = new BigCat();
		System.out.println(cat.name);
		// System.out.println(cat.hasFur);
		// System.out.println(cat.hasPaws);
		// System.out.println(cat.id);

		// Here only name is available becuase it's the only variable marked as
		// public, even Lynx extending BigCat hasFur cannot be used because we
		// are using a BigCat variable type.
		Lynx catLynx = new Lynx();
		System.out.println(catLynx.name);
		System.out.println(catLynx.hasFur);
//		System.out.println(catLynx.hasPaws);
//		System.out.println(catLynx.id);
		
	}
}
