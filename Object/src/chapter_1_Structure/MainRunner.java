package chapter_1_Structure;

public class MainRunner {
	public static void main(String[] args) {
		Ticket[] tickets = new Ticket[3];
		for(int i = 0; i < tickets.length; i++) {
			tickets[i] = new Ticket();
		}
		
		TicketOffice office = new TicketOffice(0, tickets);
		TicketSeller seller = new TicketSeller(office);
		Theater theater = new Theater(seller);
		
		Bag bag = new Bag(10000L);
		Audience audience = new Audience(bag);
				
		theater.enter(audience);
	}
}
