package br.com.gatto.chapter5.exercises;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * Exercise 16 
 * Explanation: A, B, F. Option A correctly creates the current
 * instant. Option B correctly converts from seconds to an Instant. Option F is
 * also a proper conversion. Options C, D, and E are incorrect because the
 * source object does not represent a point in time. Without a time zone, Java
 * doesn’t know what moment in time to use for the Instant.
 */
public class Exercise16 {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDateTime dateTime = LocalDateTime.now();
		ZoneId zoneId = ZoneId.systemDefault();
		ZonedDateTime zonedDateTime = ZonedDateTime.of(dateTime, zoneId);
		long epochSeconds = 0;
		Instant instant1 = Instant.now();
		Instant instant2 = Instant.ofEpochSecond(epochSeconds);
		// Instant instant3 = date.toInstant();
		// Instant instant4 = dateTime.toInstant();
		// Instant instant5 = time.toInstant();
		Instant instant6 = zonedDateTime.toInstant();
	}
}
