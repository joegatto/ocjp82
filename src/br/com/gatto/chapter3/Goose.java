package br.com.gatto.chapter3;

import java.util.ArrayList;
import java.util.List;

interface Flyer {
	void fly();
}

class HangGlider implements Flyer {
	@Override
	public void fly() {

	}
}

class Goose implements Flyer {
	@Override
	public void fly() {

	}

	private void anyFlyer(List<Flyer> flyer) {

	}

	private void groupOfFlyers(List<? extends Flyer> flyer) {

	}

	public static void main(String[] args) {
		Goose g = new Goose();
		List<Goose> list = new ArrayList<>();
		// g.anyFlyer(list);
		g.groupOfFlyers(list);

		List<Flyer> list2 = new ArrayList<>();
		g.anyFlyer(list2);
		g.groupOfFlyers(list2);
	}
}
