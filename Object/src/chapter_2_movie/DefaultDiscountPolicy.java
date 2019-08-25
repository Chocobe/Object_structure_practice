package chapter_2_movie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class DefaultDiscountPolicy implements DiscountPolicy {
	private List<DiscountCondition> conditions = new ArrayList<>();
	

//생성자
	public DefaultDiscountPolicy(DiscountCondition ... discountCondition) {
		this.conditions = Arrays.asList(discountCondition);
	}
	
	
//할인 계산
	@Override
	public Money calculateDiscountAmount(Screening screening) {
		for(DiscountCondition each : conditions) {
			if(each.isSatisfiedBy(screening)) {
				return getDiscountAmount(screening);
			}
		}
		
		return Money.ZERO;
	}
	
	
//할인을 계산할 메소드 (자식 메소드에게 위임 : 템플릿 메소드 패턴(Template Method pattern)
	abstract protected Money getDiscountAmount(Screening screening);
}
