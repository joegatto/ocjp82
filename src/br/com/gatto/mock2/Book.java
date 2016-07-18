package br.com.gatto.mock2;

class Book {
	private String title;
	private double price;
	private String genre;
	private String author;

	public Book(String title, double price) {
		this.title = title;
		this.price = price;
	}

	public Book(String title, String genre) {
		this.title = title;
		this.genre = genre;
	}

	public Book(String title, String genre, String author) {
		this.title = title;
		this.genre = genre;
		this.setAuthor(author);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}
