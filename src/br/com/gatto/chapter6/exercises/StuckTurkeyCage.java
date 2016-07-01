package br.com.gatto.chapter6.exercises;

/**
 * Exercise 2 
 * Explanation: B, C. Option A is incorrect because it will move
 * the compilation error to the close() method since it does throw an exception
 * that must be handled or declared. Option B is correct because the unhandled
 * exception becomes declared. Option C is correct because the exception becomes
 * handled. Option D is incorrect because the exception remains unhandled.
 */
public class StuckTurkeyCage implements AutoCloseable {

	@Override
	public void close() throws Exception {
		throw new Exception("Cage door does not close");
	}

	public static void main(String[] args) throws Exception {
		try (StuckTurkeyCage t = new StuckTurkeyCage()) {
			System.out.println("put turkey in");
		} catch (Exception e) {
		}
	}
}
