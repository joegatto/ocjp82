package br.com.gatto.chapter1.exercises;

/**
 * Exercise 2
 * Explanation:  
 *
 */
public class Book {
	private int ISBN;
	private String title, author;
	private int pageCount;

	public int hashCode() {
		return ISBN;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Book)) {
			return false;
		}
		Book other = (Book) obj;
		return this.ISBN == other.ISBN;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

}
