package chapter_1_Structure;

public class Audience {
	private Bag bag;
	
	
// 생성자
	public Audience(Bag bag) {
		this.bag = bag;
	}
	

// TicketSeller가 접근했던 Bag을 막고, Bag을 Audience에 캡슐화 한다.
	
// bag getter
//	public Bag getBag() {
//		System.out.println("가방을 엽니다");
//		return this.bag;
//	}
	
	public long buy(Ticket ticket) {
		if(this.bag.hasInvitation()) {
			this.bag.setTicket(ticket);
			System.out.println("관람객이 입장권을 교환하여 입장합니다");
			
			return 0L;
			
		} else {
			System.out.println("관람객이 티켓을 구입하여 입장합니다 (티켓값 : " + ticket.getFee() +")");
			this.bag.minusAmount(ticket.getFee());
			
			System.out.println("관람객이 티켓을 가방에 넣습니다");
			this.bag.setTicket(ticket);
			
			return ticket.getFee();
		}
	}
}
