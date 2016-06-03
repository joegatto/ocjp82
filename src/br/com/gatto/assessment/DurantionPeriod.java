package br.com.gatto.assessment;

import java.time.Duration;
import java.time.Period;

/**
 * d is the String P1D and p is the String PT24H. They are neither the same
 * object nor the same value. Remember that Duration uses hours/minutes/seconds
 * and Period uses years/months/days for measures.
 */
public class DurantionPeriod {
	public static void main(String[] args) {
		String d = Duration.ofDays(1).toString();
		String p = Period.ofDays(1).toString();

		boolean b1 = d == p;
		boolean b2 = d.equals(p);

		System.out.println(b1 + " " + b2);
	}
}
