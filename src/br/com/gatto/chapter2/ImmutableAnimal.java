package br.com.gatto.chapter2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class ImmutableAnimal {
	private final String species;
	private final int age;
	private final List<String> favoriteFoods;

	public ImmutableAnimal(String species, int age, List<String> favoriteFoods) {
		this.species = species;
		this.age = age;
		if (favoriteFoods == null)
			throw new RuntimeException("favoriteFood is required");
		this.favoriteFoods = new ArrayList<String>(favoriteFoods);
	}

	public String getSpecies() {
		return species;
	}

	public int getAge() {
		return age;
	}

	public int getFavoriteFoodsCount() {
		return favoriteFoods.size();
	}

	public String getFavoriteFood(int index) {
		return favoriteFoods.get(index);
	}

	public static void main(String[] args) {
		ImmutableAnimal lion = new ImmutableAnimal("Lion", 5, Arrays.asList("meat", "more meat"));

		List<String> favoriteFoods = new ArrayList<String>();
		for (int i = 0; i < lion.getFavoriteFoodsCount(); i++) {
			favoriteFoods.add(lion.getFavoriteFood(i));
		}

		ImmutableAnimal updatedLion = new ImmutableAnimal(lion.getSpecies(), lion.getAge() + 1, favoriteFoods);
	}

}
