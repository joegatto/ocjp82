package br.com.gatto.chapter5;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTests {
	public static void main(String[] args) {
		LocalTime one = LocalTime.of(5, 15);
		LocalTime two = LocalTime.of(6, 30);

		System.out.println(ChronoUnit.HOURS.between(one, two));
		System.out.println(ChronoUnit.MINUTES.between(one, two));
		// System.out.println(ChronoUnit.MINUTES.between(one, date));
	}
}
