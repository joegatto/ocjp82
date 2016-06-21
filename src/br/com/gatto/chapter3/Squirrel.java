package br.com.gatto.chapter3;

public class Squirrel {
	private int weight;
	private String species;

	public Squirrel(String theSpecies) {
		if (theSpecies == null)
			throw new IllegalArgumentException();
		species = theSpecies;
	}

	public String getSpecies() {
		return species;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
}
