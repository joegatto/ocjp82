package br.com.gatto.chapter7.exercises;

/**
 * Exercise 19
 *  Explanation: A, F. The class compiles without issue so A is
 * correct, and B and C are incorrect. The synchronized object on line k1 is
 * TicketManager.class, while the synchronized object on line k4 the instance of
 * TicketManager. The class is not thread-safe because the
 * makeTicketsAvailable() method is not synchronized, and E is incorrect. One
 * thread could call sellTickets() while another thread has unblocked accessed
 * to makeTicketsAvailable(), causing an invalid number of tickets to be reached
 * as part of a race condition. Finally, F is correct because the class
 * synchronizes using a static getInstance() method, preventing more than one
 * instance from being created.
 */
public class TicketManager {
	public TicketManager() {
		super();
	}

	private static TicketManager instance;

	public static synchronized TicketManager getInstance() {
		if (instance == null)
			instance = new TicketManager();
		return instance;
	}

	private int tickets;

	public int getTicketCount() {
		return tickets;
	}

	public void makeTicketAvailable(int value) {
		tickets += value;
	}

	public void sellTickets(int value) {
		synchronized (this) {
			tickets -= value;
		}
	}
}
