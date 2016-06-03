package br.com.gatto.chapter1.cat;

public class CatAdmirer {
	public static void main(String[] args) {
		// Here only id is not visible because it's marked as private, all
		// others are visible because this class is in the same package as
		// BigCat.
		BigCat cat = new BigCat();
		System.out.println(cat.name);
		System.out.println(cat.hasFur);
		System.out.println(cat.hasPaws);
		// System.out.println(cat.id);
	}
}
