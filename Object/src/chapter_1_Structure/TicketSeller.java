package chapter_1_Structure;

public class TicketSeller {
	private TicketOffice ticketOffice;
	
	
// 생성자
	public TicketSeller(TicketOffice ticketOffice) {
		this.ticketOffice = ticketOffice;
	}
	
	
// ticketOffice getter
	public TicketOffice getTicketOffice() {
		System.out.println("판매원이 매표소에서... ");
		return this.ticketOffice;
	}
}
