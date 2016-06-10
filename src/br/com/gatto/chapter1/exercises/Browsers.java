package br.com.gatto.chapter1.exercises;

/**
 * Exercise 12
 * Explanation:
 */
public class Browsers {
	static class Browser {
		public void go() {
			System.out.println("Inside Browser");
		}
	}

	static class IE extends Browser {
		@Override
		public void go() {
			System.out.println("Inside IE");
		}
	}

	static class Firefox extends Browser {
		@Override
		public void go() {
			System.out.println("Inside Firefox");
		}
	}

	public static void main(String[] args) {
		Browser b = new Firefox();
		IE e = (IE) b;
		e.go();
	}
}
