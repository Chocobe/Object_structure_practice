package practice_2019_08_29;

public class Theater {
	private TicketSeller ticketSeller;
	
	public boolean enter(Customer customer) {
		if(ticketSeller.checkRight(customer)) {
			return true;
			
		} else {
			return false;
		}
	}
}
