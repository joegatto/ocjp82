package br.com.gatto.chapter2;

public class ZooKeeper {
	public static void main(String[] args) {
		final Food food = FoodFactory.getFood("polar bear");
		food.consumed();
	}
}
