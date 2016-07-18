package br.com.gatto.mock2;

import java.time.Duration;

public class TestDate {
	public static void main(String[] args) {
		Duration d = Duration.ofSeconds(60);
		System.out.println(d);
		d = Duration.ofMinutes(180);
		System.out.println(d);
	}

}
