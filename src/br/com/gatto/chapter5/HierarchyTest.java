package br.com.gatto.chapter5;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class HierarchyTest {
	public static void main(String[] args) {
		Locale locale = new Locale("en", "CA");
		ResourceBundle rb = ResourceBundle.getBundle("Zoo", locale);
		System.out.print(rb.getString("hello"));
		System.out.print(".");
		System.out.print(rb.getString("name"));
		System.out.print(" ");
		System.out.print(rb.getString("open"));
		System.out.print(" ");
		System.out.print(rb.getString("visitor"));
		String format = rb.getString("helloByName");

		System.out.println();
		String formatted = MessageFormat.format(format, "Tammy");
		System.out.println(formatted);
	}
}
