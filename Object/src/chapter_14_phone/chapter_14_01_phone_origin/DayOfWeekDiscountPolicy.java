package chapter_14_phone.chapter_14_01_phone_origin;

import java.util.ArrayList;
import java.util.List;

public class DayOfWeekDiscountPolicy extends BasicRatePolicy {
	private List<DayOfWeekDiscountRule> rules = 
					new ArrayList<DayOfWeekDiscountRule>();
	
	
// 생성자
	public DayOfWeekDiscountPolicy(List<DayOfWeekDiscountRule> rules) {
		this.rules = rules;
	}
	
	
	@Override
	protected Money calculateCallFee(Call call) {
		Money result = Money.ZERO;
		
		for(DateTimeInterval interval : call.getInterval().splitByDay()) {
			for(DayOfWeekDiscountRule rule : rules) {
				result.plus(rule.calculate(interval));
			}
		}
		
		return result;
	}
}
