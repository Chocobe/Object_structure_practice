package chapter_01.chapter_1_ticketing;

@SuppressWarnings("unused")
public class Bag {
	private Long amount;
	private Ticket ticket;
	private Invitation invitation;
	
	
// 생성자
	public Bag(Long amount) {
		this(amount, null);
	}
	
	public Bag(Long amount, Invitation invitation) {
		this.amount = amount;
		this.invitation = invitation;
	}
	
	
// 티켓을 구입했을 때, 가방이 처리할 일
	public long hold(Ticket ticket) {
		if(this.hasInvitation()) {
			this.setTicket(ticket);
			System.out.println("관람객이 입장권을 교환하여 입장합니다");
			
			return 0L;
			
		} else {
			System.out.println("관람객이 티켓을 구입하여 입장합니다 (티켓값 : " + ticket.getFee() +")");
			this.minusAmount(ticket.getFee());
			
			System.out.println("관람객이 티켓을 가방에 넣습니다");
			this.setTicket(ticket);
			
			return ticket.getFee();
		}
	}
	
	
// ticket setter
	private void setTicket(Ticket ticket) {
		this.ticket = ticket;
		System.out.println("티켓을 가방에 넣습니다");
	}
	
	
// invitation 유무 검사
	private boolean hasInvitation() {
		return this.invitation != null;
	}
	
	
// minusAmount
	private void minusAmount(Long amount) {
		this.amount -= amount;
		System.out.println("가방에서 " + amount + "원을 뺍니다");		
	}
}
