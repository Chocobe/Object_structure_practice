package chapter_6.chapter_6_refactoring_ticketing;

public class TicketSeller {
	private TicketOffice ticketOffice;
	
	
	public TicketSeller(TicketOffice ticketOffice) {
		this.ticketOffice = ticketOffice;
	}
	
	
	public void sellTo(Audience audience) {
		ticketOffice.plusAmount(
						audience.buy(ticketOffice.getTicket()));
	}
}
