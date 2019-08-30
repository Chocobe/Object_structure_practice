package chapter_2_pop_origin;

public class Reservation {
	private Customer customer;
	private Screening screening;
	private Money fee;
	private int audienceCount;
	
	
// 생성자
	public Reservation(Customer customer, Screening screening, Money fee, int audienceCount) {
		this.customer = customer;
		this.screening = screening;
		this.fee = fee;
		this.audienceCount = audienceCount;	
	}
	

// customer
	// accessor
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
