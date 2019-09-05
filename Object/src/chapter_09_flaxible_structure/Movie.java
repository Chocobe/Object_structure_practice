package chapter_09_flaxible_structure;

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

// 할인이 없는 영화의 요금 계산 - 요금계산의 책임은 DiscountPolicy에서 해야 하지만,
// Movie 클래스에서 예외처리 방식으로 처리했기 때문에 일관성이 무너진다.
// : NoneDiscountPolicy 클래스에서 처리하자
//		if(discountPolicy == null) {
//			 return fee;
//		}
		
		return fee.minus(discountPolicy.calculateDiscountAmount(screening));
	}
	
	
// 할인정책 변경 메소드
	public void changeDiscountPolicy(DiscountPolicy discountPolicy) {
		this.discountPolicy = discountPolicy;
	}
}
