package br.com.gatto.chapter6;

class CannotSwimException extends Exception {

}

class DangerInTheWater extends RuntimeException {

}

class SharkInTheWaterException extends DangerInTheWater {

}

class Dophin {
	public void swim() throws CannotSwimException {

	}
}
