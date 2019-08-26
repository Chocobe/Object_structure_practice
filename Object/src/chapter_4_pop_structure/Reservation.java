package chapter_4_pop_structure;

public class Reservation {
	private Customer customer;
	private Screening screening;
	private Money fee;
	private int audienceCount;
	
	
// customer
	//accessor
	public Customer getCustomer() {
		return customer;
	}
	
	// mutator
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
// screening
	// accessor
	public Screening getScreening() {
		return screening;
	}
	
	// mutator
	public void setScreening(Screening screening) {
		this.screening = screening;
	}
	
	
// fee
	// accessor
	public Money getFee() {
		return fee;
	}
	
	// mutator
	public void setFee(Money fee) {
		this.fee = fee;
	}
	
	
// audienceCount
	// accessor
	public int getAudienceCount() {
		return audienceCount;
	}
	
	// mutator
	public void setAudienceCount(int audienceCount) {
		this.audienceCount = audienceCount;
	}
}
