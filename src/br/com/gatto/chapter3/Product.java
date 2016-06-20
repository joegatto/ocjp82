package br.com.gatto.chapter3;

public class Product implements Comparable<Product> {
	int id;
	String name;

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Product)) {
			return false;
		}
		Product p = (Product) obj;
		return this.id == p.id;
	}

	@Override
	public int compareTo(Product o) {
		return this.name.compareTo(o.name);
	}
}
