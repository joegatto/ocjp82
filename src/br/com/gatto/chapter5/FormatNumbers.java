package br.com.gatto.chapter5;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class FormatNumbers {
	public static void main(String[] args) throws ParseException {
		int attendeesPerYear = 3_200_000;
		int attendeesPerMonth = attendeesPerYear / 12;
		NumberFormat en = NumberFormat.getInstance(Locale.US);
		System.out.println(en.format(attendeesPerMonth));
		NumberFormat g = NumberFormat.getInstance(Locale.GERMANY);
		System.out.println(g.format(attendeesPerMonth));
		NumberFormat ca = NumberFormat.getInstance(Locale.CANADA_FRENCH);
		System.out.println(ca.format(attendeesPerMonth));

		double price = 48;
		NumberFormat usMoney = NumberFormat.getCurrencyInstance();
		System.out.println(usMoney.format(price));

		NumberFormat fr = NumberFormat.getInstance(Locale.FRANCE);
		String s = "40.45";
		System.out.println(en.parse(s));
		System.out.println(fr.parse(s));

		String one = "456abc";
		String two = "-2.5165x10";
		String three = "x85.3";

		NumberFormat nf = NumberFormat.getInstance();
		System.out.println(nf.parse(one));
		System.out.println(nf.parse(two));
		// System.out.println(nf.parse(three));

		String amount = "R$ 92.807,99";
		NumberFormat cf = NumberFormat.getCurrencyInstance();
		double value = (Double) cf.parse(amount);
		System.out.println(value);
	}
}
