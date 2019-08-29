package practice_2019_08_29;

public class Theater {
	private TicketOffice ticketOffice;
	

// 생성자
	public Theater() {
		this.ticketOffice = new TicketOffice();
	}
	
	
// 입장 시켜라
	public boolean enter(Customer customer, Content content) {
		System.out.println("[극장] : 손님이 입장 준비중입니다.");
		return ticketOffice.hasRightToEnter(customer, content);
	}
}
