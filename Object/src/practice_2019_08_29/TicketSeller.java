package practice_2019_08_29;

public class TicketSeller {
	
	
// 티켓을 팔아라
	public Money sellTicket(Customer customer, Content content) {
		System.out.println("[판매자] : 티켓을 판매합니다.");
		return customer.buyTicket(new Ticket(content));
	}
}
