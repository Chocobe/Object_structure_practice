package chapter_2_movie;

import java.time.LocalDateTime;

public class Screening {
	private Movie movie;
	private int sequence;
	private LocalDateTime whenScreened;
	
	
// 생성자
	public Screening(Movie movie, int sequence, LocalDateTime whenScreened) {
		this.movie = movie;
		this.sequence = sequence;
		this.whenScreened = whenScreened;
	}
	
	
// 시작시간
	public LocalDateTime getStartTime() {
		return this.whenScreened;
	}
	
	
// 순번
	public boolean isSequence(int sequence) {
		return this.sequence == sequence;
	}
	
	
// 요금
	public Money getMovieFee() {
		return this.movie.getFee();
	}
	
	
// 예약
	public Reservation reserve(Customer customer, int audienceCount) {
		return new Reservation(customer, this, 
						calculateFee(audienceCount), audienceCount);
	}
	
	
// 요금 계산
	private Money calculateFee(int audienceCount) {
		return movie.calculateMovieFee(this).times(audienceCount);
	}
}
