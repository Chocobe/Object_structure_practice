package chapter_1_Structure;

public class TicketSeller {
	private TicketOffice ticketOffice;
	
	
// 생성자
	public TicketSeller(TicketOffice ticketOffice) {
		this.ticketOffice = ticketOffice;
	}
	
	
// TicketSeller가 TicketOffice를 처리하도록 하기위해,
// TicketOffice의 getter를 삭제하여 다른 곳에서 접근할 수 없도록 한다.
	
// ticketOffice getter
//	public TicketOffice getTicketOffice() {
//		System.out.println("판매원이 매표소에서... ");
//		return this.ticketOffice;
//	}
	
	public void sellTo(Audience audience) {
		if(audience.getBag().hasInvitation()) {
			Ticket ticket = this.ticketOffice.getTicket();
			audience.getBag().setTicket(ticket);
			
			System.out.println("입장권을 교환하여 입장합니다");
			
		} else {
			Ticket ticket = this.ticketOffice.getTicket();
			audience.getBag().minusAmount(ticket.getFee());
			this.ticketOffice.plusAmount(ticket.getFee());
			audience.getBag().setTicket(ticket);
			
			System.out.println("티켓을 구입하여 입장합니다");
		}
	}
}
