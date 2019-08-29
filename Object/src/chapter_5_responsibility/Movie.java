package chapter_5_responsibility;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public abstract class Movie {
	private String title;
	private Duration runningTime;
	private Money fee;
	
	private List<DiscountCondition> discountConditions;	

	// DiscountCondition을 SequenceCondition과 PeriodCondition의 역할로 대체 (다형성 사용)
	// DiscountCondition 클래스를 SequenceCondition, PeriodCondition 으로 나눔
//	private List<DiscountCondition> discountConditions;
//	private List<SequenceCondition> sequenceConditions;
//	private List<PeriodCondition> periodConditions;

	
	// 할인정책을 따로이 클래스로 분리하기
//	private MovieType movieType;
//	private Money discountAmount;
//	private double discountPercent;
	
	
// 생성자
	public Movie(String title, Duration runningTime, Money fee,
					DiscountCondition ...discountAmounts) {
		this.title = title;
		this.runningTime = runningTime;
		this.fee = fee;
		this.discountConditions = Arrays.asList(discountAmounts);
	}
	
	
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
	}
	
	
// DiscountCondition을 SequenceCondition과 PeriodCondition의 역할로 대체	

//// 할인여부 검사
//	private boolean isDiscountable(Screening screening) {
//		return checkPeriodCondition(screening) || checkSequenceCondition(screening);
//		
//		// DiscountCondition을 SequenceCondition, PeriodCondition 으로 나눔
////		return discountConditions.stream().anyMatch(
////						condition -> condition.isSatisfiedBy(screening));
//		
//		// 참고 블로그 : https://blog.naver.com/lube12/221170814388
//		// Stream 참고 블로그 : https://futurecreator.github.io/2018/08/26/java-8-streams/
//	}
//	
//	
//// PeriodCondition의 조건에 맞는가?
//	private boolean checkPeriodCondition(Screening screening) {
//		return periodConditions.stream()
//				.anyMatch(condition -> condition.isSatisfiedBy(screening));
//	}
//	
//	
//// SequenceCondition의 조건에 맞는가?
//	private boolean checkSequenceCondition(Screening screening) {
//		return sequenceConditions.stream()
//				.anyMatch(condition-> condition.isSatisfiedBy(screening));
//	}
	

	protected abstract Money calculateDiscountAmount();
	
// 할인정책을 개별 클래스로 나누자. (추상클래스로)
//// 할인가 계산
//	private Money calculateDiscountAmount() {
//		switch(movieType) {
//		case AMOUNT_DISCOUNT:
//			return calculateAmountDiscountAmount();
//		
//		case PERCENT_DISCOUNT:
//			return calculatePercentDiscountAmount();
//			
//		case NONE_DISCOUNT:
//			return calculateNoneDiscountAmount();
//		}
//		
//		throw new IllegalArgumentException();
//	}
//	
//	
//// 금액할인가 반환
//	private Money calculateAmountDiscountAmount() {
//		return discountAmount;
//	}
//	
//	
//// 금액할인 비율 반환
//	private Money calculatePercentDiscountAmount() {
//		return fee.times(discountPercent);
//	}
//	
//	
//// 할인 미적용
//	private Money calculateNoneDiscountAmount() {
//		return Money.ZERO;
//	}

	// 자식 클래스에서 할인가를 구하기 위한 fee accessor
	protected Money getFee() {
		return fee;
	}
}
