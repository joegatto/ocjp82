package br.com.gatto.assessment;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * The first parameter is the ResultSet type. The second parameter is the
 * ResultSet concurrency mode. Choices D, E, and F are incorrect because they
 * represent the first parameter. Choice B is incorrect because it is not a
 * constant in JDBC.
 *
 */
public class JDBCTest {
	public void stmt(Connection conn, int a) throws SQLException {
		Statement stmt1 = conn.createStatement(a, ResultSet.CONCUR_READ_ONLY);
		Statement stmt2 = conn.createStatement(a, ResultSet.CONCUR_UPDATABLE);
		Statement stmt3 = conn.createStatement(a, ResultSet.TYPE_FORWARD_ONLY);
		Statement stmt4 = conn.createStatement(a, ResultSet.TYPE_SCROLL_INSENSITIVE);
		Statement stmt5 = conn.createStatement(a, ResultSet.TYPE_SCROLL_SENSITIVE);
	}
}
