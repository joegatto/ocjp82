package br.com.gatto.chapter2;

@FunctionalInterface
public interface Skip extends Sprint {
	public default int getHopCount() {
		return 10;
	}

	public static void skip(int speed) {

	}
}
