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
	
	
	private boolean isDiscountable(Screening screening) {
		return discountConditions.stream
				
		// 참고 블로그 : https://blog.naver.com/lube12/221170814388
	}

}
