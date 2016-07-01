package br.com.gatto.chapter6;

import java.sql.SQLException;
import java.time.format.DateTimeParseException;

public class RethrowingExceptions {
	public void parseData() throws SQLException, DateTimeParseException {

	}

	public void multiCatch() throws SQLException, DateTimeParseException {
		try {
			parseData();
		} catch (Exception e) {
			System.err.println(e);
			throw e;
		}
	}
}
