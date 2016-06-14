package br.com.gatto.chapter2;

public class VisitorTicketTracker {
	private static volatile VisitorTicketTracker instance;

	private VisitorTicketTracker() {
	}

	public static VisitorTicketTracker getInstance() {
		synchronized (VisitorTicketTracker.class) {
			if (instance == null)
				instance = new VisitorTicketTracker();
		}
		return instance;
	}
}
