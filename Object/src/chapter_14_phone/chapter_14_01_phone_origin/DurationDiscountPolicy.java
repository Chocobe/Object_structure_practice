package chapter_14_phone.chapter_14_01_phone_origin;

import java.util.ArrayList;
import java.util.List;

public class DurationDiscountPolicy extends BasicRatePolicy {
	private List<DurationDiscountRule> rules = 
					new ArrayList<DurationDiscountRule>();
	
	
// 생성자
	public DurationDiscountPolicy(List<DurationDiscountRule> rules) {
		this.rules = rules;
	}
	
	
	@Override
	protected Money calculateCallFee(Call call) {
		Money result = Money.ZERO;
		
		for(DurationDiscountRule rule : rules) {
			result.plus(rule.calculate(call));
		}
		
		return result;
	}
}
