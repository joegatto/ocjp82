package br.com.gatto.chapter2.exercises;

/**
 * Exercise 11 
 * Explanation: A, F. B is incorrect because it does not use the
 * return keyword. C, D, and E are incorrect because the variable e is already
 * in use from the lambda and cannot be redefined. Additionally, C is missing
 * the return keyword and E is missing the semicolon. A and F are the only
 * correct lambda expressions that match the functional interface.
 */
public class MySecret implements Secret {

	private static void caller(Secret s) {
		System.out.println(s.magic(0));
	}

	public static void main(String[] args) {
		caller((e) -> "Poof");
		// caller((e) -> { String e = ""; "Poof" });
		// caller((e) -> { String e = ""; return "Poof"; });
		// caller((e) -> { String e = ""; return "Poof" });
		caller((e) -> {
			String f = "";
			return "Poof";
		});
	}

	@Override
	public String magic(double d) {
		return "Poof";
	}

}
