package chapter_6_refactoring_ticketing;

public class Bag {
	private Long amount;
	private Invitation invitation;
	private Ticket ticket;
	
	
	public Bag(long amount) {
		this(null, amount);
	}
	
	public Bag(Invitation invitation, long amount) {
		this.invitation = invitation;
		this.amount = amount;
	}
	
	
	public Long hold(Ticket ticket) {
		if(hasInvitation()) {
			this.ticket = ticket;
			return 0L;
			
		} else {
			minusAmount(ticket.getFee());
			this.ticket = ticket;
			return ticket.getFee();
		}
	}
	
	
	private boolean hasInvitation() {
		return invitation != null;
	}
	
	
	private void minusAmount(Long amount) {
		this.amount -= amount;
	}
}
