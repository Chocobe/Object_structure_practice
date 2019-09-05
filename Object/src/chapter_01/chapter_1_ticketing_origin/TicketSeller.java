package chapter_01.chapter_1_ticketing_origin;

public class TicketSeller {
	private TicketOffice ticketOffice;
	
	
	public TicketSeller(TicketOffice ticketOffice) {
		this.ticketOffice = ticketOffice;
	}
	
	
	public TicketOffice getTicketOffice() {
		return ticketOffice;
	}
}
