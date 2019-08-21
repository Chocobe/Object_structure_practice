package chapter_1_Structure;

import java.util.ArrayList;
import java.util.Arrays;

@SuppressWarnings("unused")
public class TicketOffice {
	private long amount;
	private ArrayList<Ticket> tickets = new ArrayList<>();
	

// 생성자
	public TicketOffice(long amount, Ticket ...tickets) {
		this.amount = amount;
		this.tickets.addAll(Arrays.asList(tickets));
	}
	
	
// Ticket getter
	public Ticket getTicket() {
		System.out.println("매표소에서 티겟을 한장 뺍니다");
		return this.tickets.remove(0);
	}
	
	
// plusAmount
	public void plusAmount(long amount) {
		System.out.println("매표소의 보유금액에 " + amount + "원 더해집니다");
		this.amount += amount;
	}
	
	
// minusAmount
	public void minusAmount(long amount) {
		System.out.println("매표소의 보유금액에서 " + amount + "원 뺍니다");
		this.amount -= amount;
	}
}
