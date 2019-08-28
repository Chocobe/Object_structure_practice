package chapter_5_responsibility;

import java.time.Duration;
import java.util.List;

public class Movie {
	private String title;
	private Duration runningTime;
	private Money fee;
	private List<DiscountCondition> discountConditions;
	
	private MovieType movieType;
	private Money discountAmount;
	private double discountPercent;
	
	
// 영화요금 계산	
	public Money calculateMovieFee(Screening screening) {
		if(isDiscountable(screening)) {
			return fee.minus(calculateDiscountAmount());
		}
		
		return fee;
	}
	
	
// 할인여부 검사
	private boolean isDiscountable(Screening screening) {
		return discountConditions.stream().anyMatch(
						condition -> condition.isSatisfiedBy(screening));
		
		// 참고 블로그 : https://blog.naver.com/lube12/221170814388
		// Stream 참고 블로그 : https://futurecreator.github.io/2018/08/26/java-8-streams/
	}
	
	
// 할인가 계산
	private Money calculateDiscountAmount() {
		switch(movieType) {
		case AMOUNT_DISCOUNT:
			return calculateAmountDiscountAmount();
		
		case PERCENT_DISCOUNT:
			return calculatePercentDiscountAmount();
			
		case NONE_DISCOUNT:
			return calculateNoneDiscountAmount();
		}
		
		throw new IllegalArgumentException();
	}
	
	
// 금액할인가 반환
	private Money calculateAmountDiscountAmount() {
		return discountAmount;
	}
	
	
// 금액할인 비율 반환
	private Money calculatePercentDiscountAmount() {
		return fee.times(discountPercent);
	}
	
	
// 할인 미적용
	private Money calculateNoneDiscountAmount() {
		return Money.ZERO;
	}

}
