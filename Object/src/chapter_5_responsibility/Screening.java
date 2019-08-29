package chapter_5_responsibility;

import java.time.LocalDateTime;

public class Screening {
	private Movie movie;
	private int sequence;
	private LocalDateTime whenScreened;
	
// 예약하기
	public Reservation reserve(Customer customer, int audienceCount) {
		return new Reservation(customer, this, calculateFee(audienceCount),audienceCount);
	}
	
	
// 요금 계산하기
	public Money calculateFee(int audienceCount) {
		return movie.calculateMovieFee(this).times(audienceCount);
	}
	
	
// whenScreened accessor
	public LocalDateTime getWhenScreened() {
		return whenScreened;
	}
	
	
// sequence accressor
	public int getSequence() {
		return sequence;
	}
	
	
// 원래 요금 accessor
	public Money getFee() {
		return movie.getFee();
	}
}
