package chapter_01.chapter_1_ticketing;

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
	private Ticket getTicket() {
		System.out.println("매표소에서 티겟을 한장 뺍니다");
		return this.tickets.remove(0);
	}
	
	
// plusAmount
	private void plusAmount(long amount) {
		System.out.println("매표소의 보유금액에 " + amount + "원 더해집니다");
		this.amount += amount;
	}
	
	
// TicketOffice의 자율권 찾기
	public void sellTicketTo(Audience audience) {
		plusAmount(audience.buy(getTicket()));
	}
}
