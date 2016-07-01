package br.com.gatto.chapter6;

public class TestSeasons {
	public static void test(Seasons s) {
		switch (s) {
		case SPRING:
		case FALL:
			System.out.println("Shorter hours");
			break;
		case SUMMER:
			System.out.println("Longer hours");
		default:
			assert false : "Invalid season";
		}
	}

	public static void main(String[] args) {
		test(Seasons.WINTER);
	}
}
