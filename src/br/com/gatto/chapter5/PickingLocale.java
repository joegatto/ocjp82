package br.com.gatto.chapter5;

import java.util.Locale;

public class PickingLocale {
	public static void main(String[] args) {
		Locale locale = Locale.getDefault();
		System.out.println(locale);
		System.out.println(Locale.GERMAN);
		System.out.println(Locale.GERMANY);
		System.out.println(new Locale("fr"));
		System.out.println(new Locale("hi", "IN"));

		Locale l1 = new Locale.Builder().setLanguage("pt").setRegion("BR").build();
		Locale l2 = new Locale.Builder().setRegion("US").setLanguage("en").build();
		System.out.println(l1);
		System.out.println(l2);

		System.out.println(Locale.getDefault());
		Locale newLocale = new Locale("fr");
		Locale.setDefault(newLocale);
		System.out.println(Locale.getDefault());
	}
}
