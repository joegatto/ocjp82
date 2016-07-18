package br.com.gatto.mock2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Exercise33 {

	public static void main(String[] args) {

		List<Book> books = Arrays.asList(new Book("Freedom at Midnight", "Romance"),
				new Book("Gone with the wind", "Action"), new Book("Midnight Cowboy", "Western"));

		Comparator<Book> c1 = (b1, b2) -> b1.getGenre().compareTo(b2.getGenre()); // 1
		books.stream().sorted(c1.thenComparing(Book::getTitle)); // 2
		System.out.println(books);
	}

}
