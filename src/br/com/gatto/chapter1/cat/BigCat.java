package br.com.gatto.chapter1.cat;

public class BigCat {
	public String name = "cat";
	protected boolean hasFur = true;
	boolean hasPaws = true;
	private int id;

	public static void main(String[] args) {
		// Here all the variables are going to be visible because we are dealing with them in the same class.		
		BigCat cat = new BigCat();
		System.out.println(cat.name);
		System.out.println(cat.hasFur);
		System.out.println(cat.hasPaws);
		System.out.println(cat.id);
	}
}
