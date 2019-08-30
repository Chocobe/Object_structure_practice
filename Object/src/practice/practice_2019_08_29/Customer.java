package practice.practice_2019_08_29;

public class Customer {
	private Invitation invitation;
	private Money amount;

	
// 생성자
	public Customer(Money amount) {
		this(amount, null);
	}
	
	public Customer(Money amount, Invitation invitation) {
		this.amount = amount;
		this.invitation = invitation;
	}
	
	
// 초대장이 있는가?
	public boolean hasInvitation(Content content) {
		if(invitation != null && invitation.isValid(content)) {
			System.out.println("[손님] : 초대장을 사용합니다.");
			invitation = null;
			return true;
		}
		
		System.out.println("[손님] : 초대장이 없습니다.");
		return false;
	}
	
	
// 티켓을 사라
	public Money buyTicket(Ticket ticket) {
		Money fee = ticket.getFee();
		
		if(amount.greaterThanOrEqual(fee)) {
			System.out.println("[손님] : 티켓을 구입합니다.");
			amount = amount.minus(fee);
			return fee;
		}
		
		System.out.println("[손님] : 보유금이 부족합니다.");
		return Money.ZERO;
	}
}
