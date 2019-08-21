package chapter_1_Structure;

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
	
	
// ticket setter
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
		System.out.println("티켓을 가방에 넣습니다");
	}
	
	
// ticket 유무 검사
	public boolean hasTicket() {
		return this.ticket != null;
	}
	
	
// invitation 유무 검사
	public boolean hasInvitation() {
		return this.invitation != null;
	}
	
	
// minusAmount
	public void minusAmount(Long amount) {
		this.amount -= amount;
		System.out.println("가방에서 " + amount + "원을 뺍니다");		
	}
	
	
// plusAmount
	public void plusAmount(Long amount) {
		this.amount += amount;
		System.out.println("가방에 " + amount + "원을 넣습니다");
	}
}
