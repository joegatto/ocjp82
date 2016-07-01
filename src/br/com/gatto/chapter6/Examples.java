package br.com.gatto.chapter6;

class ExampleOne implements AutoCloseable {
	@Override
	public void close() throws IllegalStateException {
		throw new IllegalStateException("Cage door does not close");
	}
}

class ExampleTwo implements AutoCloseable {
	@Override
	public void close() throws Exception {
		throw new Exception("Cage door does not close");
	}
}

class ExampleThree implements AutoCloseable {
	static int COUNT = 0;

	@Override
	public void close() {
		COUNT++;
	}
}