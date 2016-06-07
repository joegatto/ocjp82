package br.com.gatto.chapter1;

/**
 * Enum cannot be extended. Public constructors will cause the enum to not
 * compile.
 */
public enum Season {
	SUMMER("High") {
		public void printHours() {
			System.out.println("9am - 7pm");
		}
	},
	WINTER("Low") {
		public void printHours() {
			System.out.println("9am - 3pm");
		}
	},
	SPRING("Medium") {
		public void printHours() {
			System.out.println("9am - 5pm");
		}
	},
	FALL("Medium") {
		public void printHours() {
			System.out.println("9am - 5pm");
		}
	};

	private String expectedVisitors;

	private Season(String expectedVisitors) {
		this.expectedVisitors = expectedVisitors;
	}

	public void printExpectedVisitors() {
		System.out.println(expectedVisitors);
	}

	public abstract void printHours();

	public static void main(String[] args) {
		Season s = Season.SUMMER;
		System.out.println(Season.SUMMER);
		System.out.println(s == Season.SUMMER);

		for (Season season : Season.values()) {
			System.out.println(season.name() + " " + season.ordinal());
		}

		// if (Season.SUMMER == 2) {} // DOES NOT COMPILE ENUM IS A TYPE

		Season s1 = Season.valueOf("SUMMER");
		// Season s2 = Season.valueOf("summer"); // EXCEPTION
		// IllegalArgumentException "No enum constant"

		Season summer = Season.SUMMER;
		switch (summer) {
		case WINTER:
			System.out.println("Get out the sled!");
			break;
		case SUMMER:
			System.out.println("Time for the pool!");
			break;
		default:
			System.out.println("Is it summer yet?");
		}

		Season.SUMMER.printExpectedVisitors();
		
		Season.FALL.printHours();
	}
}
