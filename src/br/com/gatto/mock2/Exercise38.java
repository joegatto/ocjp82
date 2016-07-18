package br.com.gatto.mock2;

import java.util.Arrays;
import java.util.List;

public class Exercise38 {
	public static void main(String[] args) {

		List<Book> books = Arrays.asList(new Book("Freedom at Midnight", 5.0), new Book("Gone with the wind", 5.0),
				new Book("Midnight Cowboy", 15.0));

		books.stream().filter(b -> b.getTitle().startsWith("F")).forEach(b -> b.setPrice(10.0));
		books.stream().forEach(b -> System.out.println(b.getTitle() + ":" + b.getPrice()));
	}
}
