package chapter_2_movie;

import java.time.Duration;

public class Movie {
	private String title;
	private Duration runningTime;
	private Money fee;
	private DiscountPolicy discountPolicy;
	
	
// 생성자
	public Movie(String title, Duration runningTime,
					Money fee, DiscountPolicy discountPolicy) {
		this.title = title;
		this.runningTime = runningTime;
		this.fee = fee;
		this.discountPolicy = discountPolicy;
	}
	
	
// 이 영화의 요금
	public Money getFee() {
		return fee;
	}
	
	
// 요금 계산
	public Money calculateMovieFee(Screening screening) {
		return fee.minus(discountPolicy.calculateDiscountAmount(screening));
	}
}
