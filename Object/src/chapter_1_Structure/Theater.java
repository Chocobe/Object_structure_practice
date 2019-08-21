package chapter_1_Structure;

public class Theater {
	private TicketSeller ticketSeller;
	
	
// 생성자
	public Theater(TicketSeller ticketSeller) {
		this.ticketSeller = ticketSeller;
	}
	
	
// 입장
	public void enter(Audience audience) {
		if(audience.getBag().hasInvitation()) {
			Ticket ticket = this.ticketSeller.getTicketOffice().getTicket();
			audience.getBag().setTicket(ticket);
			
			System.out.println("입장권을 교환하여 입장합니다");
			
		} else {
			Ticket ticket = this.ticketSeller.getTicketOffice().getTicket();
			audience.getBag().minusAmount(ticket.getFee());
			this.ticketSeller.getTicketOffice().plusAmount(ticket.getFee());
			audience.getBag().setTicket(ticket);
			
			System.out.println("티켓을 구입하여 입장합니다");
		}
	}
}
