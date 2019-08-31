package chapter_1.chapter_1_ticketing_origin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TicketOffice {
	private Long amount;
	private List<Ticket> tickets = new ArrayList<Ticket>();
	
	
	public TicketOffice(Long amount, Ticket ...tickets) {
		this.tickets = Arrays.asList(tickets);
	}
	
	
	public Ticket getTicket() {
		return tickets.remove(0);
	}
	
	
	public void minusAmount(Long amount) {
		this.amount -= amount;
	}
	
	
	public void plusAmount(Long amount) {
		this.amount += amount;
	}
}
