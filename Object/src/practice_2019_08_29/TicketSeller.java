package practice_2019_08_29;

public class TicketSeller {
	private TicketOffice ticketOffice;
	
	public boolean checkRight(Customer customer) {
		if(ticketOffice.checkInvitation(customer)) {
			return true;
			
		} else {
			return sellTicket(customer);
		}
	}
}
