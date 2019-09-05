package chapter_06.chapter_6_refactoring_ticketing;

public class Theater {
	private TicketSeller ticketSeller;
	
	
	public Theater(TicketSeller ticketSeller) {
		this.ticketSeller = ticketSeller;
	}
	
	
	public void enter(Audience audience) {
		ticketSeller.sellTo(audience);
	}
}
