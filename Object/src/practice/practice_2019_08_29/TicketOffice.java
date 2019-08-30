package practice.practice_2019_08_29;

public class TicketOffice {
	private Money totalEarning;
	private TicketSeller ticketSeller;
	
	
// 생성자
	public TicketOffice() {
		ticketSeller = new TicketSeller();
		totalEarning = Money.ZERO;		
	}
	
	
// 입장 가능한가?
	public boolean hasRightToEnter(Customer customer, Content content) {
		if(customer.hasInvitation(content)) {
			System.out.println("[매표소] : 손님의 초대장을 받았습니다.");
			return true;
		}
		
		if(soldTicket(ticketSeller.sellTicket(customer, content))) {
			System.out.println("[매표소] : 티켓이 정상 판매 되었습니다.");
			return true;
		}
		
		System.out.println("[매표소] : 티켓을 판매하지 못했습니다.");
		return false;
	}
	
	
// 티켓이 팔렸는가?
	private boolean soldTicket(Money amount) {
		if(!amount.equal(Money.ZERO)) {
			totalEarning = totalEarning.plus(amount);
			
			System.out.print("\t[매표소] :  판매금액   - ");
			amount.printAmount();
			
			System.out.print("\t[매표소] : 총 보유금액 - ");
			totalEarning.printAmount();
			
			return true;
		}
		
		return false;
	}
}
