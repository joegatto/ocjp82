package br.com.gatto.mock1;

import java.util.HashMap;
import java.util.Map;

class Book2 {
	private String isbn;

	public Book2(String isbn) {
		this.isbn = isbn;
	}

	public boolean equals(Object o) {
		return (o instanceof Book2 && ((Book2) o).isbn.equals(this.isbn));
	}
	
	@Override
	public int hashCode() {
		return 100;
	}
}

public class BookStore {
	Map<Book2, Integer> map = new HashMap<Book2, Integer>();

	public BookStore() {
		Book2 b = new Book2("A111");
		map.put(b, 10);
		b = new Book2("B222");
		map.put(b, 5);
	}

	Integer getNumberOfCopies(Book2 b) {
		return map.get(b);
	}

	public static void main(String[] args) {
		BookStore bs = new BookStore();
		Book2 b = new Book2("A111");
		System.out.println(bs.getNumberOfCopies(b)); // 1
	}
}
