package chapter_5.chapter_5_responsibility;

import java.util.Arrays;
import java.util.List;

public abstract class DiscountPolicy {
	private List<DiscountCondition> conditions;
	
	
// 생성자
	public DiscountPolicy(DiscountCondition ...conditions) {
		this.conditions = Arrays.asList(conditions);
	}
	
	
// 할인가 계산하기
	public Money calculateDiscountAmount(Screening screening) {
		if(isDiscountable(screening)) {
			return getDiscountAmount(screening);
		}
		
		return Money.ZERO;
	}
	
	
// 할인가능한가?
	protected boolean isDiscountable(Screening screening) {
		return conditions.stream().anyMatch(
						condition -> condition.isSatisfiedBy(screening));
	}
	
	
// 할인금액 얻기
	protected abstract Money getDiscountAmount(Screening screening);
}
