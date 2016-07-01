package br.com.gatto.chapter6;

public class Turkey implements AutoCloseable {
	public static void main(String[] args) {
		try (Turkey t = new Turkey()) {
			System.out.println(t);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void close() throws Exception {
		System.out.println("Close gate");
	}
}
