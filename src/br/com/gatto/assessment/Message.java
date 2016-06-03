package br.com.gatto.assessment;

/**
 * The code does not compile because a method is not allowed to be both abstract
 * and final. If final were removed, the answer would be B. An abstract class
 * may contain an abstract method. A static nested class may extend other
 * classes.
 */
public abstract class Message {
	public String recipient;

	// public abstract final void sendMessage(); // Abstract method cannot be
	// marked as final

	public static void main(String[] args) {
		Message m = new TextMessage();
		m.recipient = "1234567890";
		// m.sendMessage();
	}

	static class TextMessage extends Message {
		// public final void sendMessage() {
		// System.out.println("Text message to " + recipient);
		// }
	}
}
